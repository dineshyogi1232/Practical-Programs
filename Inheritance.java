package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate The Inheritance.
 */
class Parent {

	public Parent() {
		System.out.println("Parent Class Called... ");
	}

}

class SubClassA extends Parent {

	public SubClassA() {
		System.out.println("subclassA Class Called... ");
	}

}

class SubClassB extends SubClassA {

	public SubClassB() {
		System.out.println("subclassB Class Called... ");
	}

}

class SubClassC extends Parent {

	public SubClassC() {
		System.out.println("subclassC Class Called... ");
	}

}

class SubClassD extends Parent {

	public SubClassD() {
		System.out.println("subclassD Class Called... ");
	}

}

class SubClassE extends Parent {

	public SubClassE() {
		System.out.println("subclassE Class Called... ");
	}

}

public class Inheritance {

	public static void main(String[] args) {
		SubClassB subClassB = new SubClassB();
		SubClassC subClassC = new SubClassC();
		SubClassD subClassD = new SubClassD();
		SubClassE subClassE = new SubClassE();
	}

}