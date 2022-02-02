package com.OOPSConcepts;

/**
 * 
 * @author	Dinesh Yogi
 * @desc	Demonstrate Data Abstraction
 *
 */
class CarCompany {

	String companyName = null;

	public CarCompany() {
		System.out.println("Default Constructor of CarCompany class...");
	}

	public CarCompany(String companyName) {
		super();
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Company Name: " + companyName;
	}

}

class Car extends CarCompany {

	String carName = null;
	String carColor = null;

	public Car() {
		System.out.println("Dafault Constructor of Car class...");
	}

	public Car(String company, String color, String name) {
		super(company);
		this.carColor = color;
		this.carName = name;
	}

	void getDetails() {
		System.out.println(super.toString());
		System.out.println("Car Name : " + carName);
		System.out.println("Car Color: " + carColor);
	}

}

public class DataAbstraction {

	public static void main(String[] args) {
		Car car = new Car("Honda", "Black", "Swift");
		car.getDetails();
	}

}
