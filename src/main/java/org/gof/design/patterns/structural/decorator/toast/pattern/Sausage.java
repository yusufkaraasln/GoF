package org.gof.design.patterns.structural.decorator.toast.pattern;

public class Sausage extends Topping{

	public Sausage(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
