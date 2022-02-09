package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Compile Time Polymorphism example
 */
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		CalculationProgram.sum(1, 2);
		CalculationProgram.sum(1, 2, 3);
	}

}

class CalculationProgram {

	static void sum(int number1, int number2) {
		int sum = number1 + number2;
		CallingLogger.getInfoLoggerFrom("CalculationProgram", "Sum of Two numbers... " + sum);
	}

	static void sum(int number3, int number4, int number5) {
		int sum = number3 + number4 + number5;
		CallingLogger.getInfoLoggerFrom("CalculationProgram", "Sum of Three numbers..." + sum);
	}

}