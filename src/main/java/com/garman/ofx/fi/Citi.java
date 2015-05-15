package com.garman.ofx.fi;

import java.net.MalformedURLException;
import java.net.URL;

public class Citi extends FinancialInstitutionForRequest {
	
	public Citi() throws MalformedURLException {
		setOrg("Citigroup");
		setFid("24909");
		setUrl(new URL("https://www.accountonline.com/cards/svc/CitiOfxManager.do"));
	}
}
