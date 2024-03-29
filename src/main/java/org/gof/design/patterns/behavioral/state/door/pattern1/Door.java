package org.gof.design.patterns.behavioral.state.door.pattern1;

public class Door {
	private DoorState state;
	private DoorState openState = new OpenDoor();
	private DoorState closedState = new ClosedDoor();
	
	{
		openState.setDoor(this);
		openState.setClosedState(closedState);
		closedState.setDoor(this);
		closedState.setOpenState(openState);
	}

	public Door() {
		changeState(closedState);
	}

	public void open() {
		state.open();
	}

	public void close() {
		state.close();
	}

	public boolean isOpen() {
		return state.isOpen();
	}
	
	void changeState(DoorState state) {
		this.state = state;
	}
}
