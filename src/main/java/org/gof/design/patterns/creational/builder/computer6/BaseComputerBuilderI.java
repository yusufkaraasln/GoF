package org.gof.design.patterns.creational.builder.computer6;


public interface BaseComputerBuilderI {

	public BaseComputerBuilderI buildRAM();

	public BaseComputerBuilderI buildCPU();

	public BaseComputerBuilderI buildHardDrive();

	public Computer buildBaseComputer();

}
