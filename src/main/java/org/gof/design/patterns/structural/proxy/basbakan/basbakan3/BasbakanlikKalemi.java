package org.gof.design.patterns.structural.proxy.basbakan.basbakan3;

public class BasbakanlikKalemi {
	
	private Basbakan basbakan;
	
	public BasbakanlikKalemi(Basbakan basbakan){
		this.basbakan = new VekilBasbakan(basbakan);
	}

	public Basbakan banaBasbakaniVer(){
		System.out.println("Başbakanlık Kalemi: Tabi efendim");
		return basbakan;
	}
}
