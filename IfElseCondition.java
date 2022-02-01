package com.Programs;

import java.util.Scanner;

/**
 * @author	Dinesh 
 * @desc	age check using ifelse condiion
 */
public class IfElseCondition {

	public static void main(String[] args) {
		final int MINIMUMAGE = 18;
		int age = 0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		age = scannerObj.nextInt();

		if (age >= MINIMUMAGE) {
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}
		scannerObj.close();
	}

}
