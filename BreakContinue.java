package com.programs;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Print 10 Numbers and stop the execution after 7 numbers using break and
 *			continue statement
 */
public class BreakContinue {

	public static void main(String[] args) {
		int start = 1;
		int end = 10;
		int breakingPointNumber = 7;
		while (start <= end) {
			CallingLogger.getInfoLoggerFrom("BreakContinue", String.valueOf(start));
			start++;
			if (start == breakingPointNumber) {
				start++;
			} else {
				continue;
			}
		}
	}

}