package com.Programs;

import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Apply EMI Calculator in Java - Java program to calculate EMI using
 *			Class, Object, Variables, Operators, and Datatypes
 */
public class Operators {

	public static void main(String[] args) {
		int p = 0;
		float r = 0;
		int n = 0;
		double EMI = 0.0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the Principal loan amount you wish to avail (rupees): ");
		p = scannerObj.nextInt();
		System.out.println("Enter the Rate of interest (percentage): ");
		r = scannerObj.nextFloat();
		System.out.println("Enter the Loan term (months):");
		n = scannerObj.nextInt();

		r = r / 12 / 100;
		EMI = (p * r * Math.pow((1+r), n)) / ((Math.pow((1+r), n) - 1));

		System.out.println("EMI is :" + EMI);
		scannerObj.close();
	}

}
