package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Run Time Polymorphism Example
 */
class Base {

	void display() {
		CallingLogger.getInfoLoggerFrom("Base", "Base Class Called... ");
	}

}

class Derived extends Base {

	@Override
	void display() {
		CallingLogger.getInfoLoggerFrom("Derived", "Derived Class Called... ");
	}

}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Base derived = new Derived();
		derived.display();
	}

}