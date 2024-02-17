package org.gof.design.patterns.structural.decorator.toast.pattern;

public class Ketchup extends Topping{

	public Ketchup(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
