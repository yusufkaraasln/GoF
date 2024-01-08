package org.gof.design.patterns.creational.factoryMethod.solution.sol1;


import org.gof.design.patterns.creational.factoryMethod.EmployeeRandomizer;

public class DirectorFactory implements Factory {

	@Override
	public Director create() {
		Director director = new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), "Management", "Management", 5000);
		return director;
	}

}
