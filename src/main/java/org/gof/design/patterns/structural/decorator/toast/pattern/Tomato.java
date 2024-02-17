package org.gof.design.patterns.structural.decorator.toast.pattern;

public class Tomato extends Topping{

	public Tomato(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
