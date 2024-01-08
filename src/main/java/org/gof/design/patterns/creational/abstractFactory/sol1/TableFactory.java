package org.gof.design.patterns.creational.abstractFactory.sol1;

public class TableFactory implements GUIFactory {

	@Override
	public Table create() {
		return new Table();
	}
}
