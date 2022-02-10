package com.collection;

import java.util.Comparator;

/**
 * @author	Dinesh Yogi
 * @desc	Comparator Interface Example
 */
class Employee implements Comparator<Employee> {

	private String employeeName = null;
	private int salary = 0;

	public Employee(String employeeName, int salary) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public String getStudentName() {
		return employeeName;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int compare(Employee employee1, Employee employee2) {
		if (employee1.salary == employee2.salary) {
			return 0;
		}
		return employee1.salary > employee2.salary ? 1 : -1;
	}

}

public class ComparatorInterface {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Tom", 100000);
		Employee employee2 = new Employee("Jerry", 100001);
		int highestSalary = employee1.compare(employee1, employee2);
		if (highestSalary == 1) {
			System.out.println("Tom has Highest Salary...");
		} else if (highestSalary == -1) {
			System.out.println("Jerry has Highest Salary...");
		} else {
			System.out.println("Both having Same Salary...");
		}
	}

}