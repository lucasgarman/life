package com.garman.ofx;

import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import com.garman.ofx.requestmodel.*;
import com.garman.ofx.objectgraph.request.*;
import com.garman.ofx.objectgraph.response.*;
import com.garman.ofx.objectgraph.shared.*;

public class OfxContext {

	private OfxRequestModel ofxRequestModel;
	private com.garman.ofx.objectgraph.request.Ofx ofx;
	private SignonRequestMessageSetV1 signonMsgsRqV1;
	private BankRequestMessageSetV1 bankMsgsRqV1;
	private CreditCardRequestMessageSetV1 creditCardMsgsRqV1;
	private JAXBContext jaxbContext;
	private HttpURLConnection urlConnection;

	public OfxContext(OfxRequestModel ofxRequestModel) {
		this.ofxRequestModel = ofxRequestModel;
	}

	public static void main(String[] args) throws JAXBException, MalformedURLException, IOException {
//		OfxContext ofxContext = new OfxContext(new AmexPremierRewardsGoldCardRequestModel());
		OfxContext ofxContext = new OfxContext(new CitiAAdvantagePlatinumSelectWorldMasterCardRequestModel());
		ofxContext.createOfx();
		ofxContext.sendRequest();
		ofxContext.getResponse();
	}

	public void createOfx() {
		ofx = new com.garman.ofx.objectgraph.request.Ofx();
		createMessageSets();
	}

	public void createMessageSets() {
		createSignonMsgsRqV1();
		if (ofxRequestModel.getBankAcctFrom() != null) {
			createBankMsgsRqV1();
		}
		if (ofxRequestModel.getCcAcctFrom() != null) {
			createCreditCardMsgsRqV1();
		}
	}

	public void createSignonMsgsRqV1() {
		signonMsgsRqV1 = new SignonRequestMessageSetV1();
		SignonRequest sonRq = new SignonRequest();
		sonRq.setDtClient(new Date());
		sonRq.setUserId(ofxRequestModel.getUserCredentials().getUserId());
		sonRq.setUserPass(ofxRequestModel.getUserCredentials().getUserPass());
		sonRq.setLanguage("ENG");
		sonRq.setFi(ofxRequestModel.getFi());
		sonRq.setAppId("QWIN");
		sonRq.setAppVer("2200");
		signonMsgsRqV1.setSonRq(sonRq);
		ofx.setSignonMsgsRqV1(signonMsgsRqV1);
	}

	public void createBankMsgsRqV1() {
		bankMsgsRqV1 = new BankRequestMessageSetV1();
		StatementTransactionRequest stmtTrnRq = new StatementTransactionRequest();
		StatementRequest stmtRq = new StatementRequest();
		stmtRq.setBankAcctFrom(ofxRequestModel.getBankAcctFrom());
		stmtRq.setIncTran(ofxRequestModel.getIncTran());
		stmtTrnRq.setTrnUid(1001);
		stmtTrnRq.setStmtRq(stmtRq);
		bankMsgsRqV1.setStmtTrnRq(stmtTrnRq);
		ofx.setBankMsgsRqV1(bankMsgsRqV1);
	}

	public void createCreditCardMsgsRqV1() {
		creditCardMsgsRqV1 = new CreditCardRequestMessageSetV1();
		CreditCardStatementTransactionRequest ccStmtTrnRq = new CreditCardStatementTransactionRequest();
		CreditCardStatementRequest ccStmtRq = new CreditCardStatementRequest();
		ccStmtRq.setCcAcctFrom(ofxRequestModel.getCcAcctFrom());
		ccStmtRq.setIncTran(ofxRequestModel.getIncTran());
		ccStmtTrnRq.setTrnUid(1001);
		ccStmtTrnRq.setCcStmtRq(ccStmtRq);
		creditCardMsgsRqV1.setCcStmtTrnRq(ccStmtTrnRq);
		ofx.setCreditCardMsgsRqV1(creditCardMsgsRqV1);
	}

	public void sendRequest() throws JAXBException, PropertyException, IOException {
		jaxbContext = JAXBContext.newInstance(com.garman.ofx.objectgraph.request.Ofx.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

		StringWriter stringWriter = new StringWriter();
		stringWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
		stringWriter.write("<?OFX OFXHEADER=\"200\" VERSION=\"211\" SECURITY=\"NONE\" OLDFILEUID=\"NONE\" NEWFILEUID=\"NONE\"?>\n");
		marshaller.marshal(ofx, stringWriter);
		String outputString = stringWriter.toString();
		stringWriter.close();
		System.out.println(outputString); // for debugging only

		URL url = ofxRequestModel.getFi().getUrl();
		urlConnection = (HttpURLConnection) url.openConnection();
		urlConnection.setDoOutput(true);
		urlConnection.setRequestProperty("Content-type", "application/x-ofx");

		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new BufferedOutputStream(urlConnection.getOutputStream()), "UTF-8");
		outputStreamWriter.write(outputString);
		outputStreamWriter.flush();
		outputStreamWriter.close();
	}

	public void getResponse() throws IOException, JAXBException {
		Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
		for (Map.Entry<String, List<String>> headerField : headerFields.entrySet()) {
			if (headerField.getKey() != null) {
				System.out.print(headerField.getKey() + ": ");
			}
			for (String value : headerField.getValue()){
				System.out.print(value);
			}
			System.out.print("\n");
		}

		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
		} catch (IOException e) {
			bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getErrorStream(), "UTF-8"));
		}
		String line;
		StringBuilder filteredString = new StringBuilder();
		filteredString.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
		filteredString.append("<?OFX OFXHEADER=\"200\" VERSION=\"211\" SECURITY=\"NONE\" OLDFILEUID=\"NONE\" NEWFILEUID=\"NONE\"?>\n");
		while ((line = bufferedReader.readLine()) != null) {
			int i;
			if (line.endsWith(">")) {
				filteredString.append(line);
			} else if (line.contains(">")) {
				String tagName = line.substring(1, line.indexOf(">"));
				filteredString.append(line + "</" + tagName + ">");
			}
		}
//		System.out.println(filteredString.toString());
//		System.out.print("\n");
		bufferedReader.close();

		jaxbContext = JAXBContext.newInstance(com.garman.ofx.objectgraph.response.Ofx.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(filteredString.toString());
		Object response = unmarshaller.unmarshal(reader);
		reader.close();
/*		InputStream inputStream = urlConnection.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		Object response = unmarshaller.unmarshal(inputStream);
		inputStream.close();
*/
		com.garman.ofx.objectgraph.response.Ofx ofxResponse = (com.garman.ofx.objectgraph.response.Ofx) response;
/*		StatementTransactionResponse statementTransactionResponse = ofxResponse.bankResponseMessageSetV1.getStmtTrnRs();
		StatementResponse sr = statementTransactionResponse.getStmtRs();
		BankTransactionList bankTransactionList = sr.getBankTranList();
		List<StatementTransaction> transactions = bankTransactionList.getStmtTrn();
		for (StatementTransaction transaction : transactions) {
			String transactionSummary = "TRNTYPE: " + transaction.getTrnType() +  ", DTPOSTED: " + transaction.getDtPosted() +
						    ", TRNAMT: " + transaction.getTrnAmt() + ", FITID: " + transaction.getFitId() + 
						    ", NAME: " + transaction.getName() + ", MEMO: " + transaction.getMemo();
			System.out.println(transactionSummary);
		}
*/
//		if (ofxResponse.creditCardResponseMessageSetV1 != null) {		
		CreditCardStatementTransactionResponse ccStmtTrnRs = ofxResponse.creditCardResponseMessageSetV1.getCcStmtTrnRs();
		CreditCardStatementResponse sr = ccStmtTrnRs.getCcStmtRs();
		BankTransactionList bankTransactionList = sr.getBankTranList();
		List<StatementTransaction> transactions = bankTransactionList.getStmtTrn();
		for (StatementTransaction transaction : transactions) {
			String transactionSummary = "TRNTYPE: " + transaction.getTrnType() +  ", DTPOSTED: " + transaction.getDtPosted() +
						    ", TRNAMT: " + transaction.getTrnAmt() + ", FITID: " + transaction.getFitId() + 
						    ", NAME: " + transaction.getName() + ", MEMO: " + transaction.getMemo();
			System.out.println(transactionSummary);
		}
	}
}
