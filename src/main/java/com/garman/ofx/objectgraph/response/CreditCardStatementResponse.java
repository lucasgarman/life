package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.garman.ofx.objectgraph.shared.CreditCardAccount;

@XmlType(name="CreditCardStatementResponse", propOrder={"curDef", "ccAcctFrom", "bankTranList", "ledgerBal"})
public class CreditCardStatementResponse {

	private String curDef;
	private CreditCardAccount ccAcctFrom;
	private BankTransactionList bankTranList;
	private LedgerBalance ledgerBal;

	@XmlElement(name="CURDEF")
	public String getCurDef() {
		return curDef;
	}

	public void setCurDef(String curDef) {
		this.curDef = curDef;
	}

	@XmlElement(name="CCACCTFROM")
	public CreditCardAccount getCcAcctFrom() {
		return ccAcctFrom;
	}

	public void setCcAcctFrom(CreditCardAccount ccAcctFrom) {
		this.ccAcctFrom = ccAcctFrom;
	}

	@XmlElement(name="BANKTRANLIST")
	public BankTransactionList getBankTranList() {
		return bankTranList;
	}

	public void setBankTranList(BankTransactionList bankTranList) {
		this.bankTranList = bankTranList;
	}

	@XmlElement(name="LEDGERBAL")
	public LedgerBalance getLedgerBal() {
		return ledgerBal;
	}

	public void setLedgerBal(LedgerBalance ledgerBal) {
		this.ledgerBal = ledgerBal;
	}
}
