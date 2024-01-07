package org.gof.design.patterns.creational.factoryMethod.solution.sol2;

import org.gof.design.patterns.creational.factoryMethod.EmployeeRandomizer;

public class DirectorFactoryImpl implements DirectorFactory{

	@Override
	public Director create(String name, String workingDepartment, int bonus) {
		Director director = new Director(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment, bonus);
		return director;
	}
}
