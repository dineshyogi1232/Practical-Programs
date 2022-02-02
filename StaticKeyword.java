package com.Programs;

import java.util.Scanner;

public class StaticKeyword {

	static int age = 0;
	static String name = null;

	static {
		System.out.println("Hello,Good Morning");
	}

	public static void main(String[] args) {
		System.out.println(PersonDetail());
	}

	static String PersonDetail() {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		name = scannerObj.next();
		System.out.println("Enter the Age: ");
		age = scannerObj.nextInt();
		scannerObj.close();
		return "Name: " + name + "\n" + "Age: " + age;
	}

}
