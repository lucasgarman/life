package com.garman.ofx.requestmodel;

import java.net.MalformedURLException;

import com.garman.ofx.account.AmexBusinessGoldRewardsCardAccount;
import com.garman.ofx.credentials.AmexCredentials;
import com.garman.ofx.fi.Amex;
import com.garman.ofx.objectgraph.request.IncTransaction;

public class AmexBusinessGoldRewardsCardRequestModel extends OfxRequestModel {

	public AmexBusinessGoldRewardsCardRequestModel() throws MalformedURLException {
		setUserCredentials(new AmexCredentials());
		this.setFi(new Amex());
		setCcAcctFrom(new AmexBusinessGoldRewardsCardAccount());
		setIncTran(new IncTransaction());
	}
}
