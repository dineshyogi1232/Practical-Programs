package com.programs;

import java.util.Scanner;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate of StaticKeyword
 */
public class StaticKeyword {

	static int age = 0;
	static String name = null;
	static String className = "StaticKeyword";

	static {
		CallingLogger.getInfoLoggerFrom(className, "Hello,Good Morning");
	}

	public static void main(String[] args) {
		CallingLogger.getInfoLoggerFrom(className, personDetail());
	}

	static String personDetail() {
		Scanner scanner = new Scanner(System.in);
		CallingLogger.getInfoLoggerFrom(className, "Enter the Name: ");
		name = scanner.next();
		CallingLogger.getInfoLoggerFrom(className, "Enter the Age: ");
		age = scanner.nextInt();
		scanner.close();
		return "Name: " + name + "\n" + "Age: " + age;
	}

}