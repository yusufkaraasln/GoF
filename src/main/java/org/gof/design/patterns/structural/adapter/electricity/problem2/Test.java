package org.gof.design.patterns.structural.adapter.electricity.problem2;


import org.gof.design.patterns.structural.adapter.electricity.domain.tr.TurkishPowerProvider;
import org.gof.design.patterns.structural.adapter.electricity.domain.tr.TurkishPowerSource;
import org.gof.design.patterns.structural.adapter.electricity.domain.us.USPowerProvider;
import org.gof.design.patterns.structural.adapter.electricity.domain.us.USPowerSource;

public class Test {

	public static void main(String[] args) {
		TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();

		TurkishHomeApplianceCompatibleWithUSPowerSource turkishMixer = new TurkishHomeApplianceCompatibleWithUSPowerSource("Mixer");
		turkishMixer.setPowerSource(turkishPowerSource);
		turkishMixer.start();
		turkishMixer.stop();

		System.out.println();
		
		USPowerSource usPowerSource = new USPowerProvider();

		turkishMixer.setUSPowerSource(usPowerSource);
		turkishMixer.start();
		turkishMixer.stop();
	}
}
