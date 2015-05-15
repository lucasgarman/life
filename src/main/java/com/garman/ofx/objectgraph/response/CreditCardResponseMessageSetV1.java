package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CREDITCARDMSGSRSV1")
public class CreditCardResponseMessageSetV1 {

	private CreditCardStatementTransactionResponse ccStmtTrnRs;

	@XmlElement(name="CCSTMTTRNRS")
	public CreditCardStatementTransactionResponse getCcStmtTrnRs() {
		return ccStmtTrnRs;
	}

	public void setCcStmtTrnRs(CreditCardStatementTransactionResponse ccStmtTrnRs) {
		this.ccStmtTrnRs = ccStmtTrnRs;
	}
}
