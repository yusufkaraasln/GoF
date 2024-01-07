package org.gof.design.patterns.creational.abstractFactory.sol2;

interface GUIFactory {

	public Component createButton();

	public Component createList();

	public Component createTable();
}
