package com.programs;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Compare Two variables of Wrapper class using Wrapper classes
 */
public class WrapperClasses {

	public static void main(String[] args) {
		Integer integer1 = 0;
		Integer integer2 = 0;
		CallingLogger.getInfoLoggerFrom("WrapperClasses", String.valueOf(integer1.compareTo(integer2)));
		CallingLogger.getInfoLoggerFrom("WrapperClasses", String.valueOf(integer2.compareTo(integer1)));
	}

}