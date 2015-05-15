package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="OFX")
@XmlType(name="OFX", propOrder={"signonMsgsRqV1", "bankMsgsRqV1", "creditCardMsgsRqV1"})
public class Ofx {

	private SignonRequestMessageSetV1 signonMsgsRqV1;
	private BankRequestMessageSetV1 bankMsgsRqV1;
	private CreditCardRequestMessageSetV1 creditCardMsgsRqV1;

	@XmlElement(name="SIGNONMSGSRQV1")
	public SignonRequestMessageSetV1 getSignonMsgsRqV1() {
		return signonMsgsRqV1;
	}

	public void setSignonMsgsRqV1(SignonRequestMessageSetV1 signonMsgsRqV1) {
		this.signonMsgsRqV1 = signonMsgsRqV1;
	}

	@XmlElement(name="BANKMSGSRQV1")
	public BankRequestMessageSetV1 getBankMsgsRqV1() {
		return bankMsgsRqV1;
	}

	public void setBankMsgsRqV1(BankRequestMessageSetV1 bankMsgsRqV1) {
		this.bankMsgsRqV1 = bankMsgsRqV1;
	}

	@XmlElement(name="CREDITCARDMSGSRQV1")
	public CreditCardRequestMessageSetV1 getCreditCardMsgsRqV1() {
		return creditCardMsgsRqV1;
	}

	public void setCreditCardMsgsRqV1(CreditCardRequestMessageSetV1 creditCardMsgsRqV1) {
		this.creditCardMsgsRqV1 = creditCardMsgsRqV1;
	}
}
