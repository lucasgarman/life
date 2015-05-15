package com.garman.ofx.objectgraph.shared;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CreditCardAccount")
public class CreditCardAccount {

	private String acctId;

	@XmlElement(name="ACCTID")
	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
}
	
