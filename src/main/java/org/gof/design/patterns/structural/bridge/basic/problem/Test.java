
package org.gof.design.patterns.structural.bridge.basic.problem;

public class Test {

	public static void main(String[] args) {
		Client client = new Client(new AConcreteImplementation1());
		client.start();
		
		
		client = new Client(new AConcreteImplementation2());
		client.start();
	}
}
