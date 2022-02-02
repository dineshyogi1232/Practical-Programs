package com.Programs;

/**
 * 
 * @author	Dinesh Yogi
 * @des		All the string methods like charAt(), concat(), equals() etc.
 *
 */
public class StringMethods {

	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Good Morning";
		System.out.println("Getting String char using index number: " + string1.charAt(1));
		System.out.println("Concating two strings: " + string1.concat(string2));
		System.out.println("Comparing two objects of string using equals method: " + string1.equals(string2));
		System.out.println("Comparing two objects of string using compareto method: " + string1.compareTo(string2));
	}

}
