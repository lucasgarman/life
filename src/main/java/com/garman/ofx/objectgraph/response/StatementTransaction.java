package com.garman.ofx.objectgraph.response;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.garman.ofx.objectgraph.shared.DateAdapter;

@XmlType(name="StatementTransaction", propOrder={"trnType", "dtPosted", "trnAmt", "fitId", "name", "memo"})
public class StatementTransaction {

	private String trnType;
	private Date dtPosted;
	private BigDecimal trnAmt;
	private Long fitId;
	private String name;
	private String memo;

	@XmlElement(name="TRNTYPE")
	public String getTrnType() {
		return trnType;
	}

	public void setTrnType(String trnType) {
		this.trnType = trnType.trim();
	}

	@XmlElement(name="DTPOSTED")
	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getDtPosted() {
		return dtPosted;
	}

	public void setDtPosted(Date dtPosted) {
		this.dtPosted = dtPosted;
	}

	@XmlElement(name="TRNAMT")
	public BigDecimal getTrnAmt() {
		return trnAmt;
	}

	public void setTrnAmt(BigDecimal trnAmt) {
		this.trnAmt = trnAmt;
	}

	@XmlElement(name="FITID")
	public Long getFitId() {
		return fitId;
	}

	public void setFitId(Long fitId) {
		this.fitId = fitId;
	}

	@XmlElement(name="NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name="MEMO")
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}
