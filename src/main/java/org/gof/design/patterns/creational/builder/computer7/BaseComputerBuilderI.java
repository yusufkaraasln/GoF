package org.gof.design.patterns.creational.builder.computer7;


public interface BaseComputerBuilderI {

	public BaseComputerBuilderI buildRAM();

	public BaseComputerBuilderI buildCPU();

	public BaseComputerBuilderI buildHardDrive();

	public ComputerDisplayBuilderI buildBaseComputer();

}
