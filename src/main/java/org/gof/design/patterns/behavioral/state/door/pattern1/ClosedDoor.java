package org.gof.design.patterns.behavioral.state.door.pattern1;

public class ClosedDoor extends AbstractDoorState {

	public ClosedDoor() {
		super(false);
	}

	@Override
	public void open() {
		door.changeState(openState);
	}

	@Override
	public void close() { 
		System.out.println("Door is already closed!");
	}
}
