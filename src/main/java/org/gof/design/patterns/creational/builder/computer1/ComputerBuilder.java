package org.gof.design.patterns.creational.builder.computer1;


import org.gof.design.patterns.creational.builder.domain.*;

public class ComputerBuilder implements ComputerBuilderI{
	private Computer computer;
	
	public ComputerBuilder(){ }

	@Override
	public RAM buildRAM() {
		RAM ram = new RAM();
		computer.setRam(ram);
		return ram;
	}

	@Override
	public CPU buildCPU() {
		CPU cpu = new CPU();
		computer.setCpu(cpu);
		return cpu;
	}

	@Override
	public HardDrive buildHardDrive() {
		HardDrive hd = new HardDrive();
		computer.setHd(hd);
		return hd;
	}
	
	@Override
	public GraphicCard buildGraphicCard() {
		GraphicCard card = new GraphicCard();
		computer.setGraphicCard(card);
		return card;
	}

	@Override
	public Display buildDisplay() {
		Display display = new Display();
		computer.setDisplay(display);
		return display;
	}

	@Override
	public Computer buildComputer() {
		computer = new Computer();
		buildRAM();
		buildCPU() ;
		buildHardDrive();
		buildGraphicCard();
		buildDisplay();
		return computer;
	}
}
