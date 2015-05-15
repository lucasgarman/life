package com.garman.ofx.account;

import com.garman.ofx.objectgraph.shared.BankAccount;

public class ChasePersonalCheckingAccount extends BankAccount {

	public ChasePersonalCheckingAccount() {
		setBankId("021000021");
		setAcctId("987069427365");
		setAcctType("CHECKING");
	}
}
