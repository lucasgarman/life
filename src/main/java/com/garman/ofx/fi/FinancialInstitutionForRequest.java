package com.garman.ofx.fi;

import java.net.MalformedURLException;
import java.net.URL;

import com.garman.ofx.objectgraph.shared.FinancialInstitution;

public class FinancialInstitutionForRequest extends FinancialInstitution {
	
	private URL url;

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}
}
