package org.gof.design.patterns.behavioral.observer.publisher;

public class Test {

	public static void main(String[] args) {

		Publisher publisher = new Publisher();
		Publication newsweek = publisher.getNewsweek();
		Publication fourFourTwo = publisher.getFourFourTwo();

		Subscriber yusuf = new IndividualSubscriber("Yusuf");
		newsweek.addSubscriber(yusuf);
		fourFourTwo.addSubscriber(yusuf);

		Subscriber sude = new IndividualSubscriber("Sude");
		newsweek.addSubscriber(sude);

		Subscriber bank1 = new InstitutionalSubscriber("BankOne");
		newsweek.addSubscriber(bank1);

		publisher.publishNewsweek();
		publisher.publishFourFourTwo();
		publisher.publishNewsweek();
		publisher.publishNewsweek();
		publisher.publishFourFourTwo();

	}
}
