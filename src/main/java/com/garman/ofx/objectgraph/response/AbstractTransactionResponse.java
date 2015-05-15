package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AbstractTransactionResponse", propOrder={"trnUid", "status"})
public class AbstractTransactionResponse {

	private String trnUid;
	private Status status;

	@XmlElement(name="TRNUID")
	public String getTrnUid() {
		return trnUid;
	}

	public void setTrnUid(String trnUid) {
		this.trnUid = trnUid;
	}

	@XmlElement(name="STATUS")
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
