package org.gof.design.patterns.structural.bridge.shape.problem;

public class CircleMacOS extends Circle {

	public CircleMacOS(String name) {
		super(name);
	}

	@Override
	public void draw() {
		System.out.println("CircleMacOS: Drawing a circle.");
	}

	@Override
	public void erase() {
		System.out.println("CircleMacOS: Erasing a circle.");		
	}
}
