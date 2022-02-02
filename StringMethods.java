package com.Programs;
/**
 * @author Dinesh Yogi
 * @des All the string methods like charAt(), concat(), equals() etc.
 */
public class StringMethods {

	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Good Morning";
		System.out.println("Getting String char using index number: " + string1.charAt(1));
		System.out.println("Concating two strings: " + string1.concat(string2));
		System.out.println("Comparing two objects of string using equals method: " + string1.equals(string2));
		System.out.println("Comparing two objects of string using compareto method: " + string1.compareTo(string2));
		System.out.println("Length Of String: " + string1.length());
		System.out.println("Sub String from string: " + string1.substring(2));
		System.out.println("Sub String from String: " + string2.substring(2, 7));
		System.out.println("Check String empty or Not: " + string1.isEmpty());
		System.out.println("Check String blank or Not: " + string1.isBlank());
		System.out.println("Replace the character: " + string1.replace("H", "h"));
		System.out.println("Return Interned String: " + string2.intern());
		System.out.println("Return char index: " + string1.indexOf('e'));
		System.out.println("String Convert into lowercase:" + string2.toLowerCase());
		System.out.println("String Convert into uppercase:" + string1.toUpperCase());
		System.out.println("Remove all spaces from string :" + string2.trim());

	}

}
