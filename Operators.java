package com.Programs;

import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Apply EMI Calculator in Java - Java program to calculate EMI using
 *			Class, Object, Variables, Operators, and Datatypes
 */
public class Operators {

	public static void main(String[] args) {
		int loanAmount = 0;
		float interest = 0;
		int noOfMonths = 0;
		double EMI = 0.0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the Principal loan amount you wish to avail (rupees): ");
		loanAmount = scannerObj.nextInt();
		System.out.println("Enter the Rate of interest (percentage): ");
		interest = scannerObj.nextFloat();
		System.out.println("Enter the Loan term (months):");
		noOfMonths = scannerObj.nextInt();

		// Mathematical Calculation
		interest = interest / 12 / 100;
		EMI = (loanAmount * interest * Math.pow((1 + interest), noOfMonths)) / ((Math.pow((1 + interest), noOfMonths) - 1));

		System.out.println("EMI is :" + EMI);
		scannerObj.close();
	}

}
