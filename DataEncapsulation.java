package com.OOPSConcepts;

/**
 * 
 * @author	Dinesh Yogi
 * @desc	Demonstrate Data Encapsulation
 *
 */
class Student {

	String firstName = null;
	String lastName = null;
	int age = 0;

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
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
		student.setfirstName("Dinesh");
		student.setlastName("Yogi");
		student.setAge(18);
		System.out.println("Student Name: " + student.getfirstName() + " " + student.getlastName());
		System.out.println("Student Age: " + student.age);
	}

}
