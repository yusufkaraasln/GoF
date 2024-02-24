package org.gof.design.patterns.behavioral.command.lender.problem1;

public class Lender {
	
	public void lend(Borrower borrower, int money) {
		borrower.borrow(money);
	}
}
