package com.Collection;

import java.util.Comparator;

/**
 * 
 * @author	Dinesh Yogi
 * @desc	Comparator interface example
 *
 */

class Employee implements Comparator<Employee> {

	private String employeeName = null;
	private int salary = 0;

	public Employee(String employeeName, int marks) {
		super();
		this.employeeName = employeeName;
		this.salary = marks;
	}

	public String getStudentName() {
		return employeeName;
	}

	public int getMarks() {
		return salary;
	}

	@Override
	public int compare(Employee employeeObj1, Employee employeeObj2) {
		if (employeeObj1.salary == employeeObj2.salary)
			return 0;
		return employeeObj1.salary > employeeObj2.salary ? 1 : -1;
	}

}

public class ComparatorInterface {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Tom", 100000);
		Employee employee2 = new Employee("Jerry", 100001);

		int highestSalary = employee1.compare(employee1, employee2);

		System.out.println(highestSalary == 1 ? "Tom has Highest Salary... "
				: highestSalary == -1 ? "Jerry has Highest Salary... " : "Both having same salary");
	}

}