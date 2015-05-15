package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SignonRequestMessageSetV1")
public class SignonRequestMessageSetV1 extends AbstractRequestMessageSet {

	private SignonRequest sonRq;

	@XmlElement(name="SONRQ")
	public SignonRequest getSonRq() {
		return sonRq;
	}

	public void setSonRq(SignonRequest sonRq) {
		this.sonRq = sonRq;
	}
}
