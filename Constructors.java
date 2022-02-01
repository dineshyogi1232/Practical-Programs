package com.Programs;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate the example of constructor and Parameterized constructor
 */
public class Constructors {

	int number1 = 0;
	int number2 = 0;

	public Constructors() {
		System.out.println("Default Constructor");
	}

	public Constructors(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public static void main(String[] args) {
		Constructors constructorObj = new Constructors(1, 2);
		System.out.println("Number 1 is: " + constructorObj.number1);
		System.out.println("Number 2 is: " + constructorObj.number2);
		System.out.println("Summation of two number is: " + (constructorObj.number1 + constructorObj.number2));
	}

}
