package com.Programs;

/**
 * 
 * @author	Dinesh Yogi
 * @des		practical to use this & super variable.
 *
 */
public class ThisAndSuperKeyword {

	int number1 = 1;

	public ThisAndSuperKeyword() {
		System.out.println("Default Constructor called... ");
	}

	public ThisAndSuperKeyword(int number1) {
		super();
		this.number1 = number1;
		System.out.println(number1);
	}

	public static void main(String[] args) {
		ThisAndSuperKeyword thisAndSuperKeyword = new ThisAndSuperKeyword(121);
		System.out.println(thisAndSuperKeyword.getClass().getSimpleName());
	}

}
