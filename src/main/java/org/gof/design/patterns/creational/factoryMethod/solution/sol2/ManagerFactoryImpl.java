package org.gof.design.patterns.creational.factoryMethod.solution.sol2;


import org.gof.design.patterns.creational.factoryMethod.EmployeeRandomizer;

public class ManagerFactoryImpl implements ManagerFactory{

	@Override
	public Manager create(String name, String workingDepartment) {
		Manager manager = new Manager(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment);
		return manager;
	}

}
