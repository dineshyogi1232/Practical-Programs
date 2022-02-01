package com.Programs;

/**
 * @author	Dinesh 
 * @desc	Number printing using while loop & do while loop
 */
public class WhileDoWhile {	

	public static void main(String[] args) {
		whileLoop();
		doWhileLoop();
	}

	/**
	 * @author	Dinesh 
	 * @desc	Number printing using while loop
	 */
	static void whileLoop() {
		System.out.println("*** Using While Loop ***");
		int start = 1;
		int end = 10;
		while(start<=end) 
		{
			System.out.print(start);
			start++;
		}
	}

	/**
	 * @author	Dinesh 
	 * @desc	Number printing using do while loop
	 */
	static void doWhileLoop() {
		System.out.println("\n *** Using Do While Loop ***");
		int start = 1;
		int end = 10;
		do 
		{
			System.out.print(start);
			start++;
		}while(start<=end);
	}
	
}
