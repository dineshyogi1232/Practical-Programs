package com.Programs;

/**
 * @author	Dinesh Yogi
 * @desc	Pattern print using for loop
 */
public class ForLoop {

	public static void main(String[] args) {
		int row = 0;
		int column = 0;
		int size = 5;

		//For pattern 
		for (row = 1; row <= size; row++) {
			for (column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
