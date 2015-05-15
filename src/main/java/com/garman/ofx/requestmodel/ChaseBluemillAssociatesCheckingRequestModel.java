package com.garman.ofx.requestmodel;

import java.net.MalformedURLException;

import com.garman.ofx.account.ChaseBluemillAssociatesCheckingAccount;
import com.garman.ofx.credentials.ChaseCredentials;
import com.garman.ofx.fi.ChaseBank;
import com.garman.ofx.objectgraph.request.IncTransaction;

public class ChaseBluemillAssociatesCheckingRequestModel extends OfxRequestModel {

	public ChaseBluemillAssociatesCheckingRequestModel() throws MalformedURLException {
		setUserCredentials(new ChaseCredentials());
		this.setFi(new ChaseBank());
		setBankAcctFrom(new ChaseBluemillAssociatesCheckingAccount());
		setIncTran(new IncTransaction());
	}
}
