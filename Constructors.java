package com.programs;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate The Example of constructor and Parameterized constructor
 */
public class Constructors {

	static String className = "Constructors";
	int number1 = 0;
	int number2 = 0;

	public Constructors() {
		CallingLogger.getInfoLoggerFrom(className, "Default Constructor");
	}

	public Constructors(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public static void main(String[] args) {
		Constructors constructor = new Constructors(1, 2);
		CallingLogger.getInfoLoggerFrom(className, "" + constructor.number1);
		CallingLogger.getInfoLoggerFrom(className, "" + constructor.number2);
		CallingLogger.getInfoLoggerFrom(className, "" + (constructor.number1 + constructor.number2));
	}

}