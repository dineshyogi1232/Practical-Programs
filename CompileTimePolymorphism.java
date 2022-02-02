package com.OOPSConcepts;

/**
 * 
 * @author	Dinesh Yogi
 * @desc	Compile Time Polymorphism example
 *
 */
class Calculation {

	static void sum(int number1, int number2) {
		int sum = number1 + number2;
		System.out.println("Sum of Two numbers... " + sum);
	}

	static void sum(int number3, int number4, int number5) {
		int sum = number3 + number4 + number5;
		System.out.println("Sum of Three numbers..." + sum);
	}

}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Calculation.sum(1, 2);
		Calculation.sum(1, 2, 3);
	}

}
