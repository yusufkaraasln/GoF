package org.gof.design.patterns.structural.adapter.electricity.powerAdapter2;


import org.gof.design.patterns.structural.adapter.electricity.domain.tr.Appliance;
import org.gof.design.patterns.structural.adapter.electricity.domain.tr.TurkishHomeAppliance;
import org.gof.design.patterns.structural.adapter.electricity.domain.us.USPowerProvider;
import org.gof.design.patterns.structural.adapter.electricity.domain.us.USPowerSource;

public class Test1 {

	public static void main(String[] args) {
		USPowerSource usPowerSource = new USPowerProvider();
		USTurkishPowerAdapter uSTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);
		
		System.out.println();
		
		Appliance turkishMixer = new TurkishHomeAppliance("Mixer");
		turkishMixer.setPowerSource(uSTurkishPowerAdapter);
		turkishMixer.start();
		turkishMixer.stop();
		
		System.out.println();
		
		Appliance turkishBroom = new TurkishHomeAppliance("Broom");
		turkishBroom.setPowerSource(uSTurkishPowerAdapter);
		turkishBroom.start();
		turkishBroom.stop();
	}
}
