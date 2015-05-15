package com.garman.ofx.requestmodel;

import java.net.MalformedURLException;

import com.garman.ofx.account.ChasePersonalCheckingAccount;
import com.garman.ofx.credentials.ChaseCredentials;
import com.garman.ofx.fi.ChaseBank;
import com.garman.ofx.objectgraph.request.IncTransaction;

public class ChasePersonalCheckingRequestModel extends OfxRequestModel {

	public ChasePersonalCheckingRequestModel() throws MalformedURLException {
		setUserCredentials(new ChaseCredentials());
		this.setFi(new ChaseBank());
		setBankAcctFrom(new ChasePersonalCheckingAccount());
		setIncTran(new IncTransaction());
	}
}
