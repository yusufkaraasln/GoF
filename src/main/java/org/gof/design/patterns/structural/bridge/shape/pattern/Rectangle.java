package org.gof.design.patterns.structural.bridge.shape.pattern;

public class Rectangle extends AbstractShape {

	public Rectangle(String name, ShapeDrawer drawer) {
		super(name, drawer);
	}

	@Override
	public void draw() {
		drawer.drawRectangle();
	}

	@Override
	public void erase() {
		drawer.eraseRectange();
	}
}
