package com.OOPSConcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Run Time Polymorphism example
 */
class Base {

	void display() {
		System.out.println("Base Class Called... ");
	}

}

class Derived extends Base {

	void display() {
		System.out.println("Derived Class Called... ");
	}

}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Base base = new Base();
		Base derived = new Derived();
		base.display();
		derived.display();
	}

}
