package org.gof.design.patterns.behavioral.observer.publisher;

public interface Subscriber {

	public String getName();

	public void receive(Publication publication);
}
