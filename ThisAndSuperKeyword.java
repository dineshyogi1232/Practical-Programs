package com.programs;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @des		practical to use this & super variable.
 */
public class ThisAndSuperKeyword {

	int number1 = 0;

	public ThisAndSuperKeyword() {
		CallingLogger.getInfoLoggerFrom("ThisAndSuperKeyword", "Default Constructor called... ");
	}

	public ThisAndSuperKeyword(int num) {
		super();
		this.number1 = num;
		CallingLogger.getInfoLoggerFrom("ThisAndSuperKeyword", "" + number1);
	}

	public static void main(String[] args) {
		ThisAndSuperKeyword thisAndSuperKeywordObj = new ThisAndSuperKeyword(121);
	}

}