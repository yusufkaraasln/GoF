package org.gof.design.patterns.creational.builder.computer7;

public interface AccessoryBuilderI {
	
	public AccessoryBuilderI buildMouse();
	
	public AccessoryBuilderI buildKeyboard();

	public Computer build();

}
