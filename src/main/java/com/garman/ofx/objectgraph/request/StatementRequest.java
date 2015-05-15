package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.garman.ofx.objectgraph.shared.BankAccount;

@XmlType(name="StatementRequest", propOrder={"bankAcctFrom", "incTran"})
public class StatementRequest {

	private BankAccount bankAcctFrom;
	private IncTransaction incTran;

	@XmlElement(name="BANKACCTFROM")
	public BankAccount getBankAcctFrom() {
		return bankAcctFrom;
	}

	public void setBankAcctFrom(BankAccount bankAcctFrom) {
		this.bankAcctFrom = bankAcctFrom;
	}

	@XmlElement(name="INCTRAN")
	public IncTransaction getIncTran() {
		return incTran;
	}

	public void setIncTran(IncTransaction incTran) {
		this.incTran = incTran;
	}
}
