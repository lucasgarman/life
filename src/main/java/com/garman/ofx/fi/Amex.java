package com.garman.ofx.fi;

import java.net.MalformedURLException;
import java.net.URL;

public class Amex extends FinancialInstitutionForRequest {
	
	public Amex() throws MalformedURLException {
		setOrg("AMEX");
		setFid("3101");
		setUrl(new URL("https://online.americanexpress.com/myca/ofxdl/desktop/desktopDownload.do?request_type=nl_ofxdownload"));
	}
}
