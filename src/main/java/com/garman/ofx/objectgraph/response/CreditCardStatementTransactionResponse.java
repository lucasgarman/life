package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CreditCardStatementTransactionResponse")
public class CreditCardStatementTransactionResponse extends AbstractTransactionResponse {

	private CreditCardStatementResponse ccStmtRs;

	@XmlElement(name="CCSTMTRS")
	public CreditCardStatementResponse getCcStmtRs() {
		return ccStmtRs;
	}

	public void setCcStmtRs(CreditCardStatementResponse ccStmtRs) {
		this.ccStmtRs = ccStmtRs;
	}
}
