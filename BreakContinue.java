package com.Programs;

/**
 * @author	Dinesh
 * @desc	print 10 numbers and stop the execution after 7 numbers using break and
 *			continue statement
 */
public class BreakContinue {

	public static void main(String[] args) {
		int start = 1;
		int end = 10;
		int breakingPointNumber = 7;

		while (start <= end) {
			System.out.print(start);
			start++;
			if(start == breakingPointNumber){
				start++;
			}else{
				continue;
			}
		}
	}

}
