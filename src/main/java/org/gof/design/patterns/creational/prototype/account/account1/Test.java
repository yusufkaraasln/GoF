
package org.gof.design.patterns.creational.prototype.account.account1;


import org.gof.design.patterns.creational.prototype.account.domain.Customer;

public class Test {

	public static void main(String[] args) {
		// Normal credit account
		Account normalAccountPrototype = new Account("1", 1000, 1000, new Customer("Ali"), true, true, true);

		// Normal credit account. (Prototype)
		Account normalDefaultAccount = normalAccountPrototype.clone();
		normalDefaultAccount.setIban("2");
		normalDefaultAccount.setBalance(2000);
		normalDefaultAccount.setOwner(new Customer("Remzi"));

		// Negative default credit account (Prototype)
		Account negativeDefaultAccount = normalAccountPrototype.clone();
		negativeDefaultAccount.setIban("4");
		negativeDefaultAccount.setBalance(-600);
		negativeDefaultAccount.setOwner(new Customer("Mustafa"));
		negativeDefaultAccount.setOpenToWithdraw(true);
		negativeDefaultAccount.setOpenToPayment(false);
		negativeDefaultAccount.setOpenToTransfer(false);

		// Frozen default account (Prototype)
		Account frozenDefaultAccount = normalAccountPrototype.clone();
		frozenDefaultAccount.setBalance(-1_000);
		frozenDefaultAccount.setOwner(new Customer("Sukran"));
		frozenDefaultAccount.setOpenToWithdraw(false);
		frozenDefaultAccount.setOpenToPayment(false);
		frozenDefaultAccount.setOpenToTransfer(false);

	}
}
