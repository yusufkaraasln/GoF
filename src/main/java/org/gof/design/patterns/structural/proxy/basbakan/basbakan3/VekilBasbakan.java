package org.gof.design.patterns.structural.proxy.basbakan.basbakan3;

public class VekilBasbakan implements Basbakan {
	
	private Basbakan gercekBasbakan;
	
	public VekilBasbakan(Basbakan gercekBasbakan){
		this.gercekBasbakan = gercekBasbakan;
	}

	@Override
	public void dertDinle(String dert) {
		System.out.println("Vekil: Derdinizi dinliyorum.");
		
//		if(......)  // Bütün kontroller burada
		boolean ayiklandi = ayikla(dert);
		if(ayiklandi)
			this.ilet(dert);
	}

	@Override
	public void isBul(String yakinim) {
		System.out.println("Vekil: Isteginizi dinliyorum.");
	}
	
	private boolean ayikla(String dert){
		boolean b = true;
		//... falan filan inter milan kısmı
		return b;
	}
	
	private void ilet(String dert){
		gercekBasbakan.dertDinle(dert);
	}
}
