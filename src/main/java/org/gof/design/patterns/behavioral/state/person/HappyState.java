package org.gof.design.patterns.behavioral.state.person;

public class HappyState implements EmotionalState {

	public String sayGoodbye() {
		return "Bye, friend!";
	}

	public String sayHello() {
		return "Hello, friend!";
	}

}