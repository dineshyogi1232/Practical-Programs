package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Run Time Polymorphism Example
 */
class Base {

	void display() {
		System.out.println("Base Class Called... ");
	}

}

class Derived extends Base {

	@Override
	void display() {
		System.out.println("Derived Class Called... ");
	}

}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Base base = new Derived();
		base.display();
	}

}