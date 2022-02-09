package com.programs;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @des		Practical to use this & super variable.
 */
public class ThisAndSuperKeyword {

	int number = 0;

	public ThisAndSuperKeyword() {
		CallingLogger.getInfoLoggerFrom("ThisAndSuperKeyword", "Default Constructor called... ");
	}

	public ThisAndSuperKeyword(int number) {
		super();
		this.number = number;
		CallingLogger.getInfoLoggerFrom("ThisAndSuperKeyword", String.valueOf(number));
	}

	public static void main(String[] args) {
		ThisAndSuperKeyword thisAndSuperKeyword = new ThisAndSuperKeyword(121);
	}

}