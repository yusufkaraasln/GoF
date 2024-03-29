package org.gof.design.patterns.behavioral.observer.publisher;

public class InstitutionalSubscriber extends AbstractSubscriber  {
	private String name;
	
	public InstitutionalSubscriber(String name) {
		super(name);
	}
	
	public void receive(Publication publication) {
		putOnShelf(publication);
	}

	public void putOnShelf(Publication publication) {
		System.out.println(publication.getName() + " is on the shelf of " + name);
	}
}
