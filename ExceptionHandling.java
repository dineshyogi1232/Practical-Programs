package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate the Exception Handling using try, catch, finally, throw,
 *			and Throws Keyword.
 */
public class ExceptionHandling {

	private static String className = "ExceptionHandling";

	public static void main(String[] args) {
		try {
			int number1 = 1;
			int number2 = 0;
			int division = 0;

			throwException();

			// Calculation give error
			division = number1 / number2;

			CallingLogger.getInfoLoggerFrom(className, "Division is : " + division);
		} catch (ArithmeticException arithmeticexception) {
			CallingLogger.getWarningLoggerFrom(className, "Arithmetic Exception Occured... ");
		} finally {
			CallingLogger.getFinerLoggerFrom(className, "Bye...");
		}
	}

	static void throwException() throws ArithmeticException {
		try {
			CallingLogger.getWarningLoggerFrom(className, "Throw Exception Occured... ");
			throw new ArithmeticException("Devide By Zero");
		} catch (ArithmeticException arithmeticException) {
			CallingLogger.getWarningLoggerFrom(className, "Throw Arithmetic Exception Occured... ");
		} finally {
			CallingLogger.getFinerLoggerFrom(className, "In throwException() Bye...");
		}
	}

}