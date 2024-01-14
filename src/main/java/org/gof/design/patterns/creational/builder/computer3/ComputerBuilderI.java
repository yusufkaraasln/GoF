package org.gof.design.patterns.creational.builder.computer3;


import org.gof.design.patterns.creational.builder.domain.Computer;

public interface ComputerBuilderI {

	public ComputerBuilderI buildRAM();

	public ComputerBuilderI buildCPU();

	public ComputerBuilderI buildHardDrive();
	
	public ComputerBuilderI buildGraphicCard();

	public ComputerBuilderI buildDisplay();
	
	public ComputerBuilderI buildMouse();
	
	public ComputerBuilderI buildKeyboard();

	public Computer build();

}
