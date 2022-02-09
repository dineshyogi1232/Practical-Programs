package com.programs;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	All the string methods like charAt(), concat(), equals() etc.
 */
public class StringMethods {

	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Good Morning";
		String className = "StringMethods";
		CallingLogger.getInfoLoggerFrom(className, "Getting String char using index number: " + string1.charAt(1));
		CallingLogger.getInfoLoggerFrom(className, "Concating two strings: " + string1.concat(string2));
		CallingLogger.getInfoLoggerFrom(className,
				"Comparing two objects of string using equals method: " + string1.equals(string2));
		CallingLogger.getInfoLoggerFrom(className,
				"Comparing two objects of string using compareto method: " + string1.compareTo(string2));
		CallingLogger.getInfoLoggerFrom(className, "Length Of String: " + string1.length());
		CallingLogger.getInfoLoggerFrom(className, "Sub String from string: " + string1.substring(2));
		CallingLogger.getInfoLoggerFrom(className, "Sub String from String: " + string2.substring(2, 7));
		CallingLogger.getInfoLoggerFrom(className, "Check String empty or Not: " + string1.isEmpty());
		CallingLogger.getInfoLoggerFrom(className, "Check String blank or Not: " + string1.isBlank());
		CallingLogger.getInfoLoggerFrom(className, "Replace the character: " + string1.replace("H", "h"));
		CallingLogger.getInfoLoggerFrom(className, "Return Interned String: " + string2.intern());
		CallingLogger.getInfoLoggerFrom(className, "Return char index: " + string1.indexOf('e'));
		CallingLogger.getInfoLoggerFrom(className, "String Convert into lowercase:" + string2.toLowerCase());
		CallingLogger.getInfoLoggerFrom(className, "String Convert into uppercase:" + string1.toUpperCase());
		CallingLogger.getInfoLoggerFrom(className, "Remove all spaces from string :" + string2.trim());
	}

}