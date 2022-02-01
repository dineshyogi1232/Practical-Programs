package com.Programs;

import java.util.Scanner;

/**
 * @author	Dinesh Yogi 
 * @desc	Age check using if else condition
 */
public class IfElseCondition {

	public static void main(String[] args) {
		final int minimumAge = 18;
		int age = 0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		age = scannerObj.nextInt();

		//for check age
		if (age >= minimumAge) {
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}
		scannerObj.close();
	}

}
