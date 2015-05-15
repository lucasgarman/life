package com.garman.ofx.requestmodel;

import java.net.MalformedURLException;

import com.garman.ofx.account.AmexPremierRewardsGoldCardAccount;
import com.garman.ofx.credentials.AmexCredentials;
import com.garman.ofx.fi.Amex;
import com.garman.ofx.objectgraph.request.IncTransaction;

public class AmexPremierRewardsGoldCardRequestModel extends OfxRequestModel {

	public AmexPremierRewardsGoldCardRequestModel() throws MalformedURLException {
		setUserCredentials(new AmexCredentials());
		this.setFi(new Amex());
		setCcAcctFrom(new AmexPremierRewardsGoldCardAccount());
		setIncTran(new IncTransaction());
	}
}
