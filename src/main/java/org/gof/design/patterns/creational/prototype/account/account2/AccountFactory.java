
package org.gof.design.patterns.creational.prototype.account.account2;


import org.gof.design.patterns.creational.prototype.account.domain.Customer;

public class AccountFactory implements Factory {

	// Normal account
		private static Account prototype = new Account("1", 1000, 1000, new Customer("Ali"), true, true, true);

		@Override
		public Account create() {
			return prototype.clone();
		}

		@Override
		public Account create(Customer owner, double balance) {
			Account account = prototype.clone();
			account.setOwner(owner);
			account.setBalance(balance);
			return account;
		}
}
