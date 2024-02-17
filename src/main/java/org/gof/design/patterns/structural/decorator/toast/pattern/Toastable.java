package org.gof.design.patterns.structural.decorator.toast.pattern;

import java.util.List;

public interface Toastable {
	
	public int calculatePrice();
	
	List<Topping> getToppings();

}
