
package org.gof.design.patterns.structural.bridge.basic.pattern;

public class Test {

	public static void main(String[] args) {
		Client client = new Client(new ASubAbstraction(new AConcreteImplementation1()));
		client.start();
		
		
		client = new Client(new ASubAbstraction(new AConcreteImplementation2()));
		client.start();
	}
}
