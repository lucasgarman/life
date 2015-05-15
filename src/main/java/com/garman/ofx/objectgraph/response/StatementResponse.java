package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.garman.ofx.objectgraph.shared.BankAccount;

@XmlType(name="StatementResponse", propOrder={"curDef", "bankAcctFrom", "bankTranList", "ledgerBal", "availBal"})
public class StatementResponse {

	private String curDef;
	private BankAccount bankAcctFrom;
	private BankTransactionList bankTranList;
	private LedgerBalance ledgerBal;
	private AvailableBalance availBal;

	@XmlElement(name="CURDEF")
	public String getCurDef() {
		return curDef;
	}

	public void setCurDef(String curDef) {
		this.curDef = curDef;
	}

	@XmlElement(name="BANKACCTFROM")	
	public BankAccount getBankAcctFrom() {
		return bankAcctFrom;
	}

	public void setBankAcctFrom(BankAccount bankAcctFrom) {
		this.bankAcctFrom = bankAcctFrom;
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

	@XmlElement(name="AVAILBAL")	
	public AvailableBalance getAvailBal() {
		return availBal;
	}

	public void setAvailBal(AvailableBalance availBal) {
		this.availBal = availBal;
	}
}
