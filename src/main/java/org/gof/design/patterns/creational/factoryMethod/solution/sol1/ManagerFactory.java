package org.gof.design.patterns.creational.factoryMethod.solution.sol1;


import org.gof.design.patterns.creational.factoryMethod.EmployeeRandomizer;

public class ManagerFactory implements Factory {

	@Override
	public Manager create() {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
