package com.garman.ofx.objectgraph.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="OFX")
@XmlType(name="OFX")
public class Ofx {

	@XmlElement(name="SIGNONMSGSRSV1")
	public SignonResponseMessageSetV1 signonResponseMessageSetV1;

	@XmlElement(name="BANKMSGSRSV1")
	public BankResponseMessageSetV1 bankResponseMessageSetV1;

	@XmlElement(name="CREDITCARDMSGSRSV1")
	public CreditCardResponseMessageSetV1 creditCardResponseMessageSetV1;
}
