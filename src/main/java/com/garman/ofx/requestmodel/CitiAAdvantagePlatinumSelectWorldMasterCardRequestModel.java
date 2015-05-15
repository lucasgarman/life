package com.garman.ofx.requestmodel;

import java.net.MalformedURLException;

import com.garman.ofx.account.CitiAAdvantagePlatinumSelectWorldMasterCardAccount;
import com.garman.ofx.credentials.CitiCredentials;
import com.garman.ofx.fi.Citi;
import com.garman.ofx.objectgraph.request.IncTransaction;

public class CitiAAdvantagePlatinumSelectWorldMasterCardRequestModel extends OfxRequestModel {

	public CitiAAdvantagePlatinumSelectWorldMasterCardRequestModel() throws MalformedURLException {
		setUserCredentials(new CitiCredentials());
		this.setFi(new Citi());
		setCcAcctFrom(new CitiAAdvantagePlatinumSelectWorldMasterCardAccount());
		setIncTran(new IncTransaction());
	}
}
