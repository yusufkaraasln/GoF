package org.gof.design.patterns.behavioral.observer.publisher;

public class IndividualSubscriber extends AbstractSubscriber {
	
	public IndividualSubscriber(String name) {
		super(name);
	}
	
	public void receive(Publication publication) {
		read(publication);
	}

	public void read(Publication publication) {
		System.out.println(name + " is reading " + publication.getName());
	}
}
