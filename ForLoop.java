package com.Programs;

/**
 * @author	Dinesh
 * @desc	Pattern print using forloop
 */
public class ForLoop {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int n = 5;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
