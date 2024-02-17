package org.gof.design.patterns.structural.decorator.toast.pattern;

public class Cheese extends Topping{

	public Cheese(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
