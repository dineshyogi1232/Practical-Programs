package com.oopsconcepts;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Find the index of An Array element.
 */
public class Array {

	public static void main(String[] args) {
		String className = "Array";
		Scanner scanner = new Scanner(System.in);
		try {
			int index = 0;
			int flag = 0;
			int[] array = { 1, 2, 3, 4, 5 };
			CallingLogger.getInfoLoggerFrom(className, "Please Enter the element:");
			int element = scanner.nextInt();
			for (int i = 0; i < array.length; i++) {
				if (element == array[i]) {
					index = i;
					flag = 1;
				}
			}
			if (flag == 0) {
				CallingLogger.getInfoLoggerFrom(className, "!!! Sorry Element not found !!!");
			} else {
				CallingLogger.getInfoLoggerFrom(className, "Index of the element is: " + index);
			}
		} catch (InputMismatchException inputMisMatchException) {
			CallingLogger.getWarningLoggerFrom(className, "Enter only Number...");
		} finally {
			scanner.close();
		}
	}

}