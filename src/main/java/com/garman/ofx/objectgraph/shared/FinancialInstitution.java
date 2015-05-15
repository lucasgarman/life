package com.garman.ofx.objectgraph.shared;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FinancialInstitution", propOrder={"org", "fid"})
public class FinancialInstitution {

	private String org;
	private String fid;
	
	@XmlElement(name="ORG")
	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = (this.org == null) ? org : this.org;
	}

	@XmlElement(name="FID")
	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = (this.fid == null) ? fid : this.fid;
	}
}
