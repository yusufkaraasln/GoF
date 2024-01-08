package org.gof.design.patterns.creational.abstractFactory.sol1;

public class ListFactory implements GUIFactory {

	@Override
	public List create() {
		return new List();
	}

}
