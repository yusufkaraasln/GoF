package org.gof.design.patterns.creational.builder.computer6;

public interface AccessoryBuilderI {
	
	public AccessoryBuilderI buildMouse();
	
	public AccessoryBuilderI buildKeyboard();

	public Computer buildAccessories();

}
