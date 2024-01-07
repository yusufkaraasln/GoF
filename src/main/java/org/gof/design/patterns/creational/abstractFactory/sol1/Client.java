package org.gof.design.patterns.creational.abstractFactory.sol1;

public class Client {
    public Client(GUIFactory factory){
        Component component = factory.create();
        component.paint();
    }
}