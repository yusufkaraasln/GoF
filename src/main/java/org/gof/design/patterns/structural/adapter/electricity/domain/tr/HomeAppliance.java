package org.gof.design.patterns.structural.adapter.electricity.domain.tr;

public abstract class HomeAppliance implements Appliance {
	protected TurkishPowerSource powerSource;

	@Override
	public void setPowerSource(TurkishPowerSource powerSource) {
		this.powerSource = powerSource;
	}

}
