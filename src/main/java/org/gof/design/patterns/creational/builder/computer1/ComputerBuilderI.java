package org.gof.design.patterns.creational.builder.computer1;


import org.gof.design.patterns.creational.builder.domain.*;

public interface ComputerBuilderI {

	public RAM buildRAM();

	public CPU buildCPU();

	public HardDrive buildHardDrive();
	
	public GraphicCard buildGraphicCard();

	public Display buildDisplay();

	public Computer buildComputer();

}
