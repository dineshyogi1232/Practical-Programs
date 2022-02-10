package com.programs;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate The Example of constructor and Parameterized constructor
 */
public class ConstructorProgram {

	int number1 = 0;
	int number2 = 0;

	public ConstructorProgram() {
		System.out.println("Default Constructor");
	}

	public ConstructorProgram(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public static void main(String[] args) {
		ConstructorProgram constructor = new ConstructorProgram(1, 2);
		System.out.println(constructor.number1);
		System.out.println(constructor.number2);
		System.out.println(constructor.number1 + constructor.number2);
	}

}