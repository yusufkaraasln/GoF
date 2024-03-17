
package org.gof.design.patterns.behavioral.mediator.traffic;

public interface TrafficMediator {
	
	public void receive(Vehicle vehicle);
	
	public void askPermitToPass(Vehicle vehicle);

	public void done(Vehicle vehicle);

}
