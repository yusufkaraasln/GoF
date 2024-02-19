
package org.gof.design.patterns.structural.bridge.basic.problem;


public class ASubAbstraction implements AnAbstraction{
	
	@Override
	public void doIt() {
		System.out.println("ASubAbstraction: I am doing.");
	}
}
