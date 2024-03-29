package org.gof.design.patterns.creational.abstractFactory.sol3;

public class OSXFactory implements GUIFactory {
	
    public Component createButton() {
        return new OSXButton();
    }

	@Override
	public Component createList() {
		return new OSXList();
	}

	@Override
	public Component createTable() {
		return new OSXTable();
	}
}
