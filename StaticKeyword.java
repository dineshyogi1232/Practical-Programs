package com.programs;

import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate of StaticKeyword
 */
public class StaticKeyword {

	static int age = 0;
	static String name = null;

	static {
		System.out.println("Hello,Good Morning");
	}

	public static void main(String[] args) {
		System.out.println(personDetail());
	}

	static String personDetail() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		name = scanner.next();
		System.out.println("Enter the Age: ");
		age = scanner.nextInt();
		scanner.close();
		return "Name: " + name + "\n" + "Age: " + age;
	}

}