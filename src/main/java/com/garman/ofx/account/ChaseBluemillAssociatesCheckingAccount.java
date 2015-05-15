package com.garman.ofx.account;

import com.garman.ofx.objectgraph.shared.BankAccount;

public class ChaseBluemillAssociatesCheckingAccount extends BankAccount {

	public ChaseBluemillAssociatesCheckingAccount() {
		setBankId("021000021");
		setAcctId("105556510");
		setAcctType("CHECKING");
	}
}
