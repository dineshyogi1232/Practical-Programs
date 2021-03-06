package com.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Month Name print using number given by number used by switch case
 */
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Number of Month: ");
			int noOfMonth = scanner.nextInt();
			switch (noOfMonth) {
			case 1:
				System.out.println("January");
				break;

			case 2:
				System.out.println("February");
				break;

			case 3:
				System.out.println("March");
				break;

			case 4:
				System.out.println("April");
				break;

			case 5:
				System.out.println("May");
				break;

			case 6:
				System.out.println("June");
				break;

			case 7:
				System.out.println("July");
				break;

			case 8:
				System.out.println("August");
				break;

			case 9:
				System.out.println("September");
				break;

			case 10:
				System.out.println("October");
				break;

			case 11:
				System.out.println("November");
				break;

			case 12:
				System.out.println("December");
				break;

			default:
				System.err.println("Enter valid month number...");
				break;
			}
		} catch (InputMismatchException inputmismatchexception) {
			System.err.println("Please enter only number");
		} finally {
			scanner.close();
		}
	}

}