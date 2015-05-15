package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BankRequestMessageSetV1")
public class BankRequestMessageSetV1 extends AbstractRequestMessageSet {

	private StatementTransactionRequest stmtTrnRq;

	@XmlElement(name="STMTTRNRQ")
	public StatementTransactionRequest getStmtTrnRq() {
		return stmtTrnRq;
	}

	public void setStmtTrnRq(StatementTransactionRequest stmtTrnRq) {
		this.stmtTrnRq = stmtTrnRq;
	}
}
