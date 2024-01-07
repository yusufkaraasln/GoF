package org.gof.design.patterns.creational.factoryMethod.solution.sol2;


import org.gof.design.patterns.creational.factoryMethod.EmployeeRandomizer;

public class EmployeeFactoryImpl implements EmployeeFactory{

	@Override
	public Employee create(String name) {
		Employee employee = new Employee(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
