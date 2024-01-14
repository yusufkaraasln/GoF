package org.gof.design.patterns.creational.builder.computer1;


import org.gof.design.patterns.creational.builder.domain.*;

public class Test {

	public static void main(String[] args) {

		ComputerBuilderI builder = new ComputerBuilder();
		Computer computer = builder.buildComputer();
		computer.start();

		RAM ram = builder.buildRAM();
		Display display = builder.buildDisplay();

	}
}
