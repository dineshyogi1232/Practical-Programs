package com.Programs;

import java.util.Scanner;

/**
 * @author	Dinesh 
 * @desc	age check using ifelse condiion
 */
public class IfElseCondition {
	public static void main(String[] args) {
		final int MINAGE = 18;
		int age=0;
		Scanner scObj= new Scanner(System.in);
		System.out.println("Enter the Age: ");
		age = scObj.nextInt();

		if(age>=MINAGE) 
		{
			System.out.println("You are eligible for vote");
		}
		else
		{
			System.out.println("You are not eligible for vote");
		}

		scObj.close();
	}

}
