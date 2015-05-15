package com.garman.ofx.fi;

import java.net.MalformedURLException;
import java.net.URL;

public class ChaseBank extends FinancialInstitutionForRequest {
	
	public ChaseBank() throws MalformedURLException {
		setOrg("B1");
		setFid("10898");
		setUrl(new URL("https://ofx.chase.com"));
	}
}
