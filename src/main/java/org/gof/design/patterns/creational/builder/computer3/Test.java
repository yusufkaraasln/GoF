package org.gof.design.patterns.creational.builder.computer3;


import org.gof.design.patterns.creational.builder.domain.Computer;

public class Test {

	public static void main(String[] args) {

		ComputerBuilderI builder = ComputerBuilder.getBuilder();
		Computer computer1 = builder.buildRAM().buildHardDrive().buildGraphicCard().buildDisplay().buildCPU().build();
		computer1.start();
		
		System.out.println("");
		
		Computer computer2 = builder.buildRAM().buildHardDrive().buildGraphicCard().buildDisplay().buildCPU().buildMouse().buildKeyboard().build();
		computer2.start();
	}
}
