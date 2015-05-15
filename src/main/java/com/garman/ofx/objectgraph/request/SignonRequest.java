package com.garman.ofx.objectgraph.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.garman.ofx.objectgraph.shared.FinancialInstitution;
import com.garman.ofx.objectgraph.shared.DateAdapter;

@XmlType(name="SignonRequest", propOrder={"dtClient", "userId", "userPass", "language", "fi", "appId", "appVer"})
public class SignonRequest {

	private Date dtClient;
	private String userId;
	private String userPass;
	private String language;
	private FinancialInstitution fi;
	private String appId;
	private String appVer;

	@XmlElement(name="DTCLIENT")
	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getDtClient() {
		return dtClient;
	}

	public void setDtClient(Date dtClient) {
		this.dtClient = dtClient;
	}

	@XmlElement(name="USERID")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@XmlElement(name="USERPASS")
	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@XmlElement(name="LANGUAGE")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@XmlElement(name="FI")
	public FinancialInstitution getFi() {
		return fi;
	}

	public void setFi(FinancialInstitution fi) {
		this.fi = fi;
	}

	@XmlElement(name="APPID")
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	@XmlElement(name="APPVER")
	public String getAppVer() {
		return appVer;
	}

	public void setAppVer(String appVer) {
		this.appVer = appVer;
	}
}
