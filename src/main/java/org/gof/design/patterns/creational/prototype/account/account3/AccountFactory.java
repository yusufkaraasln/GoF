
package org.gof.design.patterns.creational.prototype.account.account3;


import org.gof.design.patterns.creational.prototype.account.domain.Customer;

public class AccountFactory implements Factory {

	// Normal account
	private static Account prototype = new Account("1", 0, 1000, null, true, true, true);

	// Normal account
	private static Account negativePrototype = new Account("1", 0, 1000, null, true, true, false);

	// Normal account
	private static Account frozenPrototype = new Account("1", -1000, 1000, null, false, false, false);

	@Override
	public Account createNormalAccount() {
		return prototype.clone();
	}

	@Override
	public Account createNormalAccount(Customer owner, double balance) {
		Account account = prototype.clone();
		account.setOwner(owner);
		account.setBalance(balance);
		return account;
	}

	@Override
	public Account createNegativeAccount(Customer owner, double balance) {
		Account account = negativePrototype.clone();
		account.setOwner(owner);
		account.setBalance(balance);
		return account;
	}

	@Override
	public Account createFrozenAccount(Customer owner, double balance) {
		Account account = frozenPrototype.clone();
		account.setOwner(owner);
		account.setBalance(balance);
		return account;
	}
}
