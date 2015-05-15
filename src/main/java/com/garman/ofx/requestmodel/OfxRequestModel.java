package com.garman.ofx.requestmodel;

import com.garman.ofx.credentials.AbstractUserCredentials;
import com.garman.ofx.fi.FinancialInstitutionForRequest;
import com.garman.ofx.objectgraph.shared.BankAccount;
import com.garman.ofx.objectgraph.shared.CreditCardAccount;
import com.garman.ofx.objectgraph.request.IncTransaction;

public abstract class OfxRequestModel {

	private AbstractUserCredentials userCredentials;
	private FinancialInstitutionForRequest fi;
	private BankAccount bankAcctFrom;
	private CreditCardAccount ccAcctFrom;
	private IncTransaction incTran;

	public AbstractUserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(AbstractUserCredentials userCredentials) {
		this.userCredentials = (this.userCredentials == null) ? userCredentials : this.userCredentials;
	}

	public FinancialInstitutionForRequest getFi() {
		return fi;
	}

	public void setFi(FinancialInstitutionForRequest fi) {
		this.fi = (this.fi == null) ? fi : this.fi;
	}

	public BankAccount getBankAcctFrom() {
		return bankAcctFrom;
	}

	public void setBankAcctFrom(BankAccount bankAcctFrom) {
		this.bankAcctFrom = (this.bankAcctFrom == null) ? bankAcctFrom : this.bankAcctFrom;
	}

	public CreditCardAccount getCcAcctFrom() {
		return ccAcctFrom;
	}

	public void setCcAcctFrom(CreditCardAccount ccAcctFrom) {
		this.ccAcctFrom = (this.ccAcctFrom == null) ? ccAcctFrom : this.ccAcctFrom;
	}

	public IncTransaction getIncTran() {
		return incTran;
	}

	public void setIncTran(IncTransaction incTran) {
		this.incTran = (this.incTran == null) ? incTran : this.incTran;
	}
}
