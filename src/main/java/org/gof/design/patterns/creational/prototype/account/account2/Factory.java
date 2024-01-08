
package org.gof.design.patterns.creational.prototype.account.account2;


import org.gof.design.patterns.creational.prototype.account.domain.Customer;

public interface Factory {
	
	Account create();
	
	Account create(Customer owner, double balance);
	
}
