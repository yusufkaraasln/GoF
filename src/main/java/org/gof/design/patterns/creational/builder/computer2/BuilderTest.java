package org.gof.design.patterns.creational.builder.computer2;

import org.gof.design.patterns.creational.builder.domain.Computer;

public class BuilderTest {

	public static void main(String[] args) {

		ComputerBuilderI builder = new ComputerBuilder();
		Computer computer = builder.build();
		computer.start();
	}
}
