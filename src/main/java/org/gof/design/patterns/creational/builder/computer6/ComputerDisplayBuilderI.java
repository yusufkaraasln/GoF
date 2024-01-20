package org.gof.design.patterns.creational.builder.computer6;

public interface ComputerDisplayBuilderI {
	
	public ComputerDisplayBuilderI buildGraphicCard();

	public ComputerDisplayBuilderI buildDisplay();

	public Computer buildComputerDisplay();

}
