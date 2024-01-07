package org.gof.design.patterns.creational.factoryMethod.solution.sol1;


public class PayrollOffice {

	public void paySalary(Employee employee) {
		String name = employee.getName();
		String department = employee.getDepartment();
		double salary = employee.calculateSalary();
		
		System.out.println("Paying " + salary + " to " + name + " in " + department);
	}
}
