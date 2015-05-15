package com.garman.ofx.objectgraph.response;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.garman.ofx.objectgraph.shared.DateAdapter;

@XmlType(name="BankTransactionList", propOrder={"dtStart", "dtEnd", "stmtTrn"})
public class BankTransactionList {

	private Date dtStart;
	private Date dtEnd;
	private List<StatementTransaction> stmtTrn;

	@XmlElement(name="DTSTART")
	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getDtStart() {
		return dtStart;
	}

	public void setDtStart(Date dtStart) {
		this.dtStart = dtStart;
	}

	@XmlElement(name="DTEND")
	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getDtEnd() {
		return dtEnd;
	}

	public void setDtEnd(Date dtEnd) {
		this.dtEnd = dtEnd;
	}

	@XmlElement(name="STMTTRN")
	public List<StatementTransaction> getStmtTrn() {
		return stmtTrn;
	}

	public void setStmtTrn(List<StatementTransaction> stmtTrn) {
		this.stmtTrn = stmtTrn;
	}
}
