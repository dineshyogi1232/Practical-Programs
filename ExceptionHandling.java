package com.OOPSConcepts;
/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate the Exception Handling using try, catch, finally, throw,
 *			and throws keyword.
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int number1 = 1;
			int number2 = 0;
			int division = 0;
			throwException();

			// Calculation give error
			division = number1 / number2;

			System.out.println("Division is : " + division);
		} catch (ArithmeticException arithmeticexception) {
			System.err.println("Arithmetic Exception Occured... ");
		} finally {
			System.out.println("Bye");
		}
	}

	static void throwException() throws ArithmeticException {
		try {
			System.err.println("Throw Exception Occured... ");
			throw new ArithmeticException("Devide By Zero");
		} catch (ArithmeticException arithmeticException) {
			System.err.println("Throws Exception Occured... ");
		}
	}

}