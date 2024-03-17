package org.gof.design.patterns.behavioral.chainOfResponsibility.callCenter;

public abstract class AbstractCallTaker implements CallTaker{
	protected CallTaker next;
	protected Customer customer;
	
	public AbstractCallTaker(CallTaker next) {
		this.next = next;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
