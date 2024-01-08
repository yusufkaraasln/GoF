
package org.gof.design.patterns.creational.prototype.account.account3;


import org.gof.design.patterns.creational.prototype.account.domain.Customer;

public class Test {
	
	public static void main(String[] args) {
		Factory factory = new AccountFactory();
		
		// Normal account
		Account normalAccount = factory.createNormalAccount(new Customer("Remzi"), 4500);
		normalAccount.setIban("2");
		System.out.println(normalAccount.isOpenToWithdraw());
		System.out.println(normalAccount.isOpenToPayment());
		System.out.println(normalAccount.isOpenToTransfer());

		System.out.println();
		
		// Negative account
		Account negativeAccount = factory.createNegativeAccount(new Customer("Mustafa"), -750);
		System.out.println(negativeAccount.isOpenToWithdraw());
		System.out.println(negativeAccount.isOpenToPayment());
		System.out.println(negativeAccount.isOpenToTransfer());
		
		System.out.println();
		// Frozen default account
		Account frozenAccount = factory.createFrozenAccount(new Customer("Sukran"), -1000);
		System.out.println(frozenAccount.isOpenToWithdraw());
		System.out.println(frozenAccount.isOpenToPayment());
		System.out.println(frozenAccount.isOpenToTransfer());
	}
}
