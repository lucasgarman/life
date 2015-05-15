package com.garman.ofx.objectgraph.response;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.garman.ofx.objectgraph.shared.DateAdapter;

@XmlType(name="AvailableBalance", propOrder={"balAmt", "dtAsOf"})
public class AvailableBalance {

	private BigDecimal balAmt;
	private Date dtAsOf;

	@XmlElement(name="BALAMT")
	public BigDecimal getBalAmt() {
		return balAmt;
	}

	public void setBalAmt(BigDecimal balAmt) {
		this.balAmt = balAmt;
	}

	@XmlElement(name="DTASOF")
	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getDtAsOf() {
		return dtAsOf;
	}

	public void setDtAsOf(Date dtAsOf) {
		this.dtAsOf = dtAsOf;
	}
}
