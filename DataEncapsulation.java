package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate Data Encapsulation Program
 */
class Student {

	String firstName = null;
	String lastName = null;
	int age = 0;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class DataEncapsulation {

	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("Dinesh");
		student.setLastName("Yogi");
		student.setAge(18);
		CallingLogger.getInfoLoggerFrom("DataEncapsulation",
				"Student Name: " + student.getFirstName() + " " + student.getLastName());
		CallingLogger.getInfoLoggerFrom("DataEncapsulation", "Student Age: " + student.getAge());
	}

}