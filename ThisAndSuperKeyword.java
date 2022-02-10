package com.programs;

/**
 * @author	Dinesh Yogi
 * @des		Practical to use this & super variable.
 */
public class ThisAndSuperKeyword {

	int number = 0;

	public ThisAndSuperKeyword() {
		System.out.println("Default Constructor called... ");
	}

	public ThisAndSuperKeyword(int number) {
		super();
		this.number = number;
		System.out.println(number);
	}

	public static void main(String[] args) {
		ThisAndSuperKeyword thisAndSuperKeyword = new ThisAndSuperKeyword(121);
	}

}