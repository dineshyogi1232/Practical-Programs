package com.programs;

import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Apply EMI Calculator in Java - Java Program to calculate EMI using
 *			Class, Object, Variables, Operators, and Datatypes
 */
public class Operators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principal loan amount you wish to avail (rupees): ");
		int loanAmount = scanner.nextInt();
		System.out.println("Enter the Rate of interest (percentage): ");
		float interest = scanner.nextFloat();
		System.out.println("Enter the Loan term (months):");
		int noOfMonths = scanner.nextInt();

		// Mathematical Calculation
		interest = interest / 12 / 100;
		double emi = (loanAmount * interest * Math.pow((1 + interest), noOfMonths))
				/ ((Math.pow((1 + interest), noOfMonths) - 1));

		System.out.println("EMI is :" + emi);
		scanner.close();
	}

}