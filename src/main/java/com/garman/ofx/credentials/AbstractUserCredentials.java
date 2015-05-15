package com.garman.ofx.credentials;

public abstract class AbstractUserCredentials {

	private String userId;
	private String userPass;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = (this.userId == null) ? userId : this.userId;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = (this.userPass == null) ? userPass : this.userPass;
	}
}
