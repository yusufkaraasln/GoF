package org.gof.design.patterns.behavioral.chainOfResponsibility.callCenter;

public interface Customer {

	public void askAQuestion();
	
	public void receiveAnswer(String answer);
}
