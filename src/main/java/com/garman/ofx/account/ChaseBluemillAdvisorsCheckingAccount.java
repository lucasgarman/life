package com.garman.ofx.account;

import com.garman.ofx.objectgraph.shared.BankAccount;

public class ChaseBluemillAdvisorsCheckingAccount extends BankAccount {

	public ChaseBluemillAdvisorsCheckingAccount() {
		setBankId("021000021");
		setAcctId("105556510");
		setAcctType("CHECKING");
	}
}
