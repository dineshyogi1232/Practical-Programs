package com.programs;

import java.util.Scanner;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Apply EMI Calculator in Java - Java Program to calculate EMI using
 *			Class, Object, Variables, Operators, and Datatypes
 */
public class Operators {

	public static void main(String[] args) {
		String className = "Operators";
		Scanner scannerObj = new Scanner(System.in);
		CallingLogger.getInfoLoggerFrom(className, "Enter the Principal loan amount you wish to avail (rupees): ");
		int loanAmount = scannerObj.nextInt();
		CallingLogger.getInfoLoggerFrom(className, "Enter the Rate of interest (percentage): ");
		float interest = scannerObj.nextFloat();
		CallingLogger.getInfoLoggerFrom(className, "Enter the Loan term (months):");
		int noOfMonths = scannerObj.nextInt();

		// Mathematical Calculation
		interest = interest / 12 / 100;
		double emi = (loanAmount * interest * Math.pow((1 + interest), noOfMonths))
				/ ((Math.pow((1 + interest), noOfMonths) - 1));

		CallingLogger.getInfoLoggerFrom(className, "EMI is :" + emi);
		scannerObj.close();
	}

}