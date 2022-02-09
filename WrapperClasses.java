package com.programs;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Compare Two variables of Wrapper class using Wrapper classes
 */
public class WrapperClasses {

	public static void main(String[] args) {
		Integer integerObj1 = 0;
		Integer integerObj2 = 0;

		CallingLogger.getInfoLoggerFrom("WrapperClasses", "" + integerObj1.compareTo(integerObj2));
		CallingLogger.getInfoLoggerFrom("WrapperClasses", "" + integerObj2.compareTo(integerObj1));
	}

}