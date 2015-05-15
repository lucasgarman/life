package com.garman.ofx.objectgraph.shared;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BankAccount", propOrder={"bankId", "acctId", "acctType"})
public class BankAccount {

	private String bankId;
	private String acctId;
	private String acctType;

	@XmlElement(name="BANKID")
	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	@XmlElement(name="ACCTID")
	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	@XmlElement(name="ACCTTYPE")
	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
}
