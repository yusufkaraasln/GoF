
package org.gof.design.patterns.structural.proxy.basbakan.basbakan2;

public class Vatandas {
	private Vekil vekil = new Vekil();

	public String derdiniAnlat() {
		vekil.dinle("Bir derdim var...");
		return "Yasasiiinnn!!!";
	}

	public String isIste() {
		vekil.dinle("Oglum'a iş bul...");
		return "Yasasiiinnn!!!";
	}
}
