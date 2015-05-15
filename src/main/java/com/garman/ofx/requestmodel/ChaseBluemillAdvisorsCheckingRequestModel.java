package com.garman.ofx.requestmodel;

import java.net.MalformedURLException;

import com.garman.ofx.account.ChaseBluemillAdvisorsCheckingAccount;
import com.garman.ofx.credentials.ChaseCredentials;
import com.garman.ofx.fi.ChaseBank;
import com.garman.ofx.objectgraph.request.IncTransaction;

public class ChaseBluemillAdvisorsCheckingRequestModel extends OfxRequestModel {

	public ChaseBluemillAdvisorsCheckingRequestModel() throws MalformedURLException {
		setUserCredentials(new ChaseCredentials());
		this.setFi(new ChaseBank());
		setBankAcctFrom(new ChaseBluemillAdvisorsCheckingAccount());
		setIncTran(new IncTransaction());
	}
}
