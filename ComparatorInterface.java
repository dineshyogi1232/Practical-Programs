package com.collection;

import java.util.Comparator;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Comparator interface example
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
		if (employeeObj1.salary == employeeObj2.salary) {
			return 0;
		}
		return employeeObj1.salary > employeeObj2.salary ? 1 : -1;
	}

}

public class ComparatorInterface {

	public static void main(String[] args) {
		String className = "ComparatorInterface";
		Employee employee1 = new Employee("Tom", 100000);
		Employee employee2 = new Employee("Jerry", 100001);

		int highestSalary = employee1.compare(employee1, employee2);

		if (highestSalary == 1) {
			CallingLogger.getInfoLoggerFrom(className, "Tom has Highest Salary...");
		} else if (highestSalary == -1) {
			CallingLogger.getInfoLoggerFrom(className, "Jerry has Highest Salary...");
		} else {
			CallingLogger.getInfoLoggerFrom(className, "Both having Same Salary...");
		}
	}

}