package org.gof.design.patterns.behavioral.state.door.pattern1;

public class OpenDoor extends AbstractDoorState {

	public OpenDoor() {
		super(true);
	}

	@Override
	public void open() {
		System.out.println("Door is already open!");
	}

	@Override
	public void close() {
		door.changeState(closedState);
	}
}
