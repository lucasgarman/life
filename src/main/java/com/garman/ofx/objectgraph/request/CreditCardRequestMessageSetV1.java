package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CreditCardRequestMessageSetV1")
public class CreditCardRequestMessageSetV1 {

	private CreditCardStatementTransactionRequest ccStmtTrnRq;

	@XmlElement(name="CCSTMTTRNRQ")
	public CreditCardStatementTransactionRequest getCcStmtTrnRq() {
		return ccStmtTrnRq;
	}

	public void setCcStmtTrnRq(CreditCardStatementTransactionRequest ccStmtTrnRq) {
		this.ccStmtTrnRq = ccStmtTrnRq;
	}
}
