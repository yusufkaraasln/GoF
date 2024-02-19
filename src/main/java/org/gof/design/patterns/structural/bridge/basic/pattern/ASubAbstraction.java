
package org.gof.design.patterns.structural.bridge.basic.pattern;


public class ASubAbstraction implements AnAbstraction{
	
	private AnAbstrationImplementation implementation;
	
	public ASubAbstraction(AnAbstrationImplementation implementation){
		this.implementation = implementation;
	}

	@Override
	public void doIt() {
		System.out.println("I am extending AnAbstraction.");
		implementation.doingIt();
	}
}
