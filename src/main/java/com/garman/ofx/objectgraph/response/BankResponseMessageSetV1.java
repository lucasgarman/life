package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BankResponseMessageSetV1")
public class BankResponseMessageSetV1 {

	private StatementTransactionResponse stmtTrnRs;

	@XmlElement(name="STMTTRNRS")
	public StatementTransactionResponse getStmtTrnRs() {
		return stmtTrnRs;
	}

	public void setStmtTrnRs(StatementTransactionResponse stmtTrnRs) {
		this.stmtTrnRs = stmtTrnRs;
	}
}
