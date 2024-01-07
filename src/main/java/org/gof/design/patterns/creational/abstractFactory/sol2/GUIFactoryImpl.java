package org.gof.design.patterns.creational.abstractFactory.sol2;

public class GUIFactoryImpl implements GUIFactory {
    public Button createButton() {
        return new Button();
    }

	@Override
	public List createList() {
		return new List();
	}

	@Override
	public Table createTable() {
		return new Table();
	}
}
