package com.programs;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Number printing using while loop & do while loop
 */
public class WhileDoWhile {

	public static void main(String[] args) {
		whileLoop();
		doWhileLoop();
	}

	static void whileLoop() {
		CallingLogger.getInfoLoggerFrom("WhileDoWhile", "*** Using While Loop ***");
		int start = 1;
		int end = 10;
		while (start <= end) {
			System.out.print(start);
			start++;
		}
	}

	static void doWhileLoop() {
		CallingLogger.getInfoLoggerFrom("WhileDoWhile", "\n *** Using Do While Loop ***");
		int start = 1;
		int end = 10;
		do {
			System.out.print(start);
			start++;
		} while (start <= end);
	}

}