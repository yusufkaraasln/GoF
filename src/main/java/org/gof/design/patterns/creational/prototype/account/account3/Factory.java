
package org.gof.design.patterns.creational.prototype.account.account3;


import org.gof.design.patterns.creational.prototype.account.domain.Customer;

public interface Factory {
	
	Account createNormalAccount();
	
	Account createNormalAccount(Customer owner, double balance);
	
	Account createNegativeAccount(Customer owner, double balance);
	
	Account createFrozenAccount(Customer owner, double balance);
	
}
