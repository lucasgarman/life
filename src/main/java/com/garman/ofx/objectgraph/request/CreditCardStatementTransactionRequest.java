package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CreditCardStatementTransactionRequest")
public class CreditCardStatementTransactionRequest extends AbstractTransactionRequest {

	private CreditCardStatementRequest ccStmtRq;

	@XmlElement(name="CCSTMTRQ")
	public CreditCardStatementRequest getCcStmtRq() {
		return ccStmtRq;
	}

	public void setCcStmtRq(CreditCardStatementRequest ccStmtRq) {
		this.ccStmtRq = ccStmtRq;
	}
}
