package org.gof.design.patterns.behavioral.command.lender.pattern;

public class Lender {
	public void lend(Command command, int money) {
		command.execute(money);
	}
}
