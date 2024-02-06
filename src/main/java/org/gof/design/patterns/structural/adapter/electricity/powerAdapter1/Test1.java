package org.gof.design.patterns.structural.adapter.electricity.powerAdapter1;


import org.gof.design.patterns.structural.adapter.electricity.domain.tr.Appliance;
import org.gof.design.patterns.structural.adapter.electricity.domain.tr.TurkishHomeAppliance;
import org.gof.design.patterns.structural.adapter.electricity.domain.us.USPowerProvider;
import org.gof.design.patterns.structural.adapter.electricity.domain.us.USPowerSource;

public class Test1 {

	public static void main(String[] args) {
		USPowerSource usPowerSource = new USPowerProvider();
		USTurkishPowerAdapter uSTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);
		
		System.out.println();
		
		Appliance shaver = new TurkishHomeAppliance("Shaver");
		shaver.setPowerSource(uSTurkishPowerAdapter);
		shaver.start();
		shaver.stop();
		
		System.out.println();

	}
}
