package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SignonResponseMessageSetV1")
public class SignonResponseMessageSetV1 {

	private SignonResponse sonRs;

	@XmlElement(name="SONRS")
	public SignonResponse getSonRs() {
		return sonRs;
	}

	public void setSonRs(SignonResponse sonRs) {
		this.sonRs = sonRs;
	}
}
