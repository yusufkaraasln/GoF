package org.gof.design.patterns.behavioral.state.person;

public class SadState implements EmotionalState {

	public String sayGoodbye() {
		return "Bye. Sniff, sniff.";
	}

	public String sayHello() {
		return "Hello. Sniff, sniff.";
	}

}