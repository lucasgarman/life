package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="StatementTransactionRequest")
public class StatementTransactionRequest extends AbstractTransactionRequest {

	private StatementRequest stmtRq;

	@XmlElement(name="STMTRQ")
	public StatementRequest getStmtRq() {
		return stmtRq;
	}

	public void setStmtRq(StatementRequest stmtRq) {
		this.stmtRq = stmtRq;
	}
}
