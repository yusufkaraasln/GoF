package org.gof.design.patterns.structural.adapter.electricity.problem2;


import org.gof.design.patterns.structural.adapter.electricity.domain.tr.TurkishPowerSource;
import org.gof.design.patterns.structural.adapter.electricity.domain.us.USPowerSource;
import org.gof.design.patterns.structural.adapter.electricity.problem1.TurkishHomeAppliance;

public class TurkishHomeApplianceCompatibleWithUSPowerSource extends TurkishHomeAppliance {
	private USPowerSource usPowerSource;
	private boolean turkishPowerSource;

	private String name;

	public TurkishHomeApplianceCompatibleWithUSPowerSource(String name) {
		super(name);
		this.name = name;
	}



	@Override
	public void setPowerSource(TurkishPowerSource powerSource) {
		this.powerSource = powerSource;
		turkishPowerSource = true;
	}

	public void setUSPowerSource(USPowerSource usPowerSource) {
		this.usPowerSource = usPowerSource;
		turkishPowerSource = false;
	}

	@Override
	public void start() {
		System.out.println("TurkishHomeAppliance " + name + " is starting!");
		if (turkishPowerSource)
			powerSource.turnOn();
		else
			usPowerSource.pushSwitch();
	}

	@Override
	public void stop() {
		System.out.println("TurkishHomeAppliance " + name + " stoping!");
		if (turkishPowerSource)
			powerSource.turnOff();
		else
			usPowerSource.pushSwitch();
	}
}
