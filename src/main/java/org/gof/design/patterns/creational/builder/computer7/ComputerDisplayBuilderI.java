package org.gof.design.patterns.creational.builder.computer7;

public interface ComputerDisplayBuilderI {
	
	public ComputerDisplayBuilderI buildGraphicCard();

	public ComputerDisplayBuilderI buildDisplay();

	public AccessoryBuilderI buildComputerDisplay();

}
