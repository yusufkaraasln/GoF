package org.gof.design.patterns.structural.decorator.toast.problem;

public class CheeseTomatoToast extends CheseToast {

	public CheeseTomatoToast() {
		name = "Cheese Domato Toast";
	}
	
	@Override
	public int calculatePrice() {
		return super.calculatePrice() + 2;
	}
}
