package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="StatementTransactionResponse")
public class StatementTransactionResponse extends AbstractTransactionResponse {

	private StatementResponse stmtRs;

	@XmlElement(name="STMTRS")
	public StatementResponse getStmtRs() {
		return stmtRs;
	}

	public void setStmtRs(StatementResponse stmtRs) {
		this.stmtRs = stmtRs;
	}
}
