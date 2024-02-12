package org.gof.design.patterns.structural.facade.computer;

public class Client {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
	}
}
