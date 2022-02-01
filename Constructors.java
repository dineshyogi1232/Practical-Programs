package com.Programs;

/**
 * @author	Dinesh
 * @desc	demonstrate the example of constructor and Parameterized constructor
 */
public class Constructors {
	int num1=0;
	int num2=0;

	public Constructors() {
		System.out.println("Default Constructor");
	}

	public Constructors(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public static void main(String[] args) {
		Constructors constObj = new Constructors(1, 2);
		System.out.println("Number 1 is: " + constObj.num1);
		System.out.println("Number 2 is: " + constObj.num2);
		System.out.println("Summation of two number is: " + (constObj.num1 + constObj.num2));
	}

}
