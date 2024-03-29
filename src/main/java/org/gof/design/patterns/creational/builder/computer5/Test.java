package org.gof.design.patterns.creational.builder.computer5;


public class Test {

	public static void main(String[] args) {
		
		Computer bareBoneComputer = Computer.getBuilder("barebone computer").buildCPU().buildRAM().buildHardDrive().build();
		bareBoneComputer.start();
		
		System.out.println();
		
		Computer.getBuilder("another computer").buildCPU().buildRAM().buildHardDrive().build().start();
		
		System.out.println();
		
		Computer.getBuilder("barebone computer").buildCPU().buildRAM().buildHardDrive();

	}
}
