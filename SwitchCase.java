package com.programs;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Month Name print using number given by number used by switch case
 */
public class SwitchCase {

	public static void main(String[] args) {
		String className = "SwitchCase";
		Scanner scannerObj = new Scanner(System.in);
		try {
			CallingLogger.getInfoLoggerFrom(className, "Enter Number of Month: ");
			int noOfMonth = scannerObj.nextInt();
			switch (noOfMonth) {
			case 1:
				CallingLogger.getInfoLoggerFrom(className, "January");
				break;

			case 2:
				CallingLogger.getInfoLoggerFrom(className, "February");
				break;

			case 3:
				CallingLogger.getInfoLoggerFrom(className, "March");
				break;

			case 4:
				CallingLogger.getInfoLoggerFrom(className, "April");
				break;

			case 5:
				CallingLogger.getInfoLoggerFrom(className, "May");
				break;

			case 6:
				CallingLogger.getInfoLoggerFrom(className, "June");
				break;

			case 7:
				CallingLogger.getInfoLoggerFrom(className, "July");
				break;

			case 8:
				CallingLogger.getInfoLoggerFrom(className, "August");
				break;

			case 9:
				CallingLogger.getInfoLoggerFrom(className, "September");
				break;

			case 10:
				CallingLogger.getInfoLoggerFrom(className, "October");
				break;

			case 11:
				CallingLogger.getInfoLoggerFrom(className, "November");
				break;

			case 12:
				CallingLogger.getInfoLoggerFrom(className, "December");
				break;

			default:
				CallingLogger.getWarningLoggerFrom(className, "Enter valid month number...");
				break;
			}
		} catch (InputMismatchException inputmismatchexception) {
			CallingLogger.getWarningLoggerFrom(className, "Please enter only number");
		} finally {
			scannerObj.close();
		}
	}

}