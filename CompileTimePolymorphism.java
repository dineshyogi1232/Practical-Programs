package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Compile Time Polymorphism Example
 */
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		CallingLogger.getInfoLoggerFrom("CompileTimePolymorphism", ProgramOfCalculation.sum(1, 2));
		CallingLogger.getInfoLoggerFrom("CompileTimePolymorphism", ProgramOfCalculation.sum(1, 2, 3));
	}

}

class ProgramOfCalculation {

	static String sum(int number1, int number2) {
		return "Sum of Two numbers... " + (number1 + number2);
	}

	static String sum(int number1, int number2, int number3) {
		return "Sum of Three numbers..." + (number1 + number2 + number3);
	}

}