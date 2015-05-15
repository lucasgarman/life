package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AbstractTransactionRequest")
public abstract class AbstractTransactionRequest {

	private Integer trnUid;

	@XmlElement(name="TRNUID")
	public Integer getTrnUid() {
		return trnUid;
	}

	public void setTrnUid(Integer trnUid) {
		this.trnUid = trnUid;
	}
}
