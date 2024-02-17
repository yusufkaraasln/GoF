package org.gof.design.patterns.structural.decorator.toast.problem;

public class SausageTomatoToast extends SausageToast {

	public SausageTomatoToast() {
		name = "Sausage Domato Toast";
	}
	
	@Override
	public int calculatePrice() {
		return super.calculatePrice() + 2;
	}

}
