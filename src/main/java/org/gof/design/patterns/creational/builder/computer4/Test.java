package org.gof.design.patterns.creational.builder.computer4;


public class Test {

	public static void main(String[] args) {
		
		Computer bareBoneComputer = Computer.getBuilder("barebone computer").buildCPU().buildRAM().buildHardDrive().build();
		bareBoneComputer.start();
		
		

	}
}
