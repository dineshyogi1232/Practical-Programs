package com.programs;

import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Age Check using if else condition
 */
public class IfElseCondition {

	public static void main(String[] args) {
		final int minimumAge = 18;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = scanner.nextInt();

		// for check age
		if (age >= minimumAge) {
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}
		scanner.close();
	}

}