package org.gof.design.patterns.behavioral.state.door.pattern1;

public interface DoorState {

	void open();
	
	void close();
	
	boolean isOpen();
	
	void setDoor(Door door);

	void setClosedState(DoorState closedState);

	void setOpenState(DoorState openState);
}
