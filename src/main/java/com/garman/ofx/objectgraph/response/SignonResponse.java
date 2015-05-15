package com.garman.ofx.objectgraph.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.garman.ofx.objectgraph.shared.DateAdapter;
import com.garman.ofx.objectgraph.shared.FinancialInstitution;

@XmlType(name="SignonResponse", propOrder={"status", "dtServer", "language", "fi"})
public class SignonResponse {

	private Status status;
	private Date dtServer;
	private String language;
	private FinancialInstitution fi;

	@XmlElement(name="STATUS")
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@XmlElement(name="DTSERVER")
	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getDtServer() {
		return dtServer;
	}

	public void setDtServer(Date dtServer) {
		this.dtServer = dtServer;
	}

	@XmlElement(name="LANGUAGE")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@XmlElement(name="FI")
	public FinancialInstitution getFi() {
		return fi;
	}

	public void setFi(FinancialInstitution fi) {
		this.fi = fi;
	}
}
