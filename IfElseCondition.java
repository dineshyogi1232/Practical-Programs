package com.programs;

import java.util.Scanner;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Age Check using if else condition
 */
public class IfElseCondition {

	public static void main(String[] args) {
		String className = "IfElseCondition";
		final int minimumAge = 18;
		Scanner scanner = new Scanner(System.in);
		CallingLogger.getInfoLoggerFrom(className, "Enter the Age: ");
		int age = scanner.nextInt();

		// for check age
		if (age >= minimumAge) {
			CallingLogger.getInfoLoggerFrom(className, "You are eligible for vote");
		} else {
			CallingLogger.getInfoLoggerFrom(className, "You are not eligible for vote");
		}
		scanner.close();
	}

}