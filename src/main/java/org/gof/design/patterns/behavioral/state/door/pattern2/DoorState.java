package org.gof.design.patterns.behavioral.state.door.pattern2;

public interface DoorState {

	void open();
	
	void close();
	
	boolean isOpen();
}
