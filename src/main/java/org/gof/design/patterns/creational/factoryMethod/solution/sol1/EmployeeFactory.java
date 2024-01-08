package org.gof.design.patterns.creational.factoryMethod.solution.sol1;


import org.gof.design.patterns.creational.factoryMethod.EmployeeRandomizer;

public class EmployeeFactory implements Factory {

	@Override
	public Employee create() {
		Employee employee = new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
