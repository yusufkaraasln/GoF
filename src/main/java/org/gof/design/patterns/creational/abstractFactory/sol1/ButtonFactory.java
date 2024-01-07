package org.gof.design.patterns.creational.abstractFactory.sol1;

public class ButtonFactory implements GUIFactory {
	
	public Button create() {
		return new Button();
	}
}
