package com.programs;

/**
 * @author	Dinesh Yogi
 * @desc	Pattern Print using for loop
 */
public class ForLoop {

	public static void main(String[] args) {
		int size = 5;

		// For pattern
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.println("* ");
			}
			System.out.println();
		}
	}

}