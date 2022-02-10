package com.programs;

/**
 * @author	Dinesh Yogi
 * @desc	Number Printing using while loop & do while loop
 */
public class WhileDoWhile {

	public static void main(String[] args) {
		whileLoop();
		doWhileLoop();
	}

	static void whileLoop() {
		System.out.println("*** Using While Loop ***");
		int start = 1;
		int end = 10;
		while (start <= end) {
			System.out.print(start);
			start++;
		}
	}

	static void doWhileLoop() {
		System.out.println("*** Using Do While Loop ***");
		int start = 1;
		int end = 10;
		do {
			System.out.print(start);
			start++;
		} while (start <= end);
	}

}