package com.oopsconcepts;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Find the Index of An Array element.
 */
public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int index = 0;
			int flag = 0;
			int[] array = { 1, 2, 3, 4, 5 };
			System.out.println("Please Enter the element:");
			int element = scanner.nextInt();
			for (int i = 0; i < array.length; i++) {
				if (element == array[i]) {
					index = i;
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println("!!! Sorry Element not found !!!");
			} else {
				System.out.println("Index of the element is: " + index);
			}
		} catch (InputMismatchException inputMisMatchException) {
			System.out.println("Enter only Number...");
		} finally {
			scanner.close();
		}
	}

}