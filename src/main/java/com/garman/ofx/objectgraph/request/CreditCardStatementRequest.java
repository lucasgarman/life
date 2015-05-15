package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.garman.ofx.objectgraph.shared.CreditCardAccount;

@XmlType(name="CreditCardStatementRequest", propOrder={"ccAcctFrom", "incTran"})
public class CreditCardStatementRequest {

	private CreditCardAccount ccAcctFrom;
	private IncTransaction incTran;

	@XmlElement(name="CCACCTFROM")
	public CreditCardAccount getCcAcctFrom() {
		return ccAcctFrom;
	}

	public void setCcAcctFrom(CreditCardAccount ccAcctFrom) {
		this.ccAcctFrom = ccAcctFrom;
	}

	@XmlElement(name="INCTRAN")
	public IncTransaction getIncTran() {
		return incTran;
	}

	public void setIncTran(IncTransaction incTran) {
		this.incTran = incTran;
	}
}
