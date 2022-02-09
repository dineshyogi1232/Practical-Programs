package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate The Inheritance.
 */
class Parent {

	public Parent() {
		CallingLogger.getInfoLoggerFrom("Parent", "Parent Class Called... ");
	}

}

class SubClassA extends Parent {

	public SubClassA() {
		CallingLogger.getInfoLoggerFrom("SubClassA", "subclassA Class Called... ");
	}

}

class SubClassB extends SubClassA {

	public SubClassB() {
		CallingLogger.getInfoLoggerFrom("SubClassB", "subclassB Class Called... ");
	}

}

class SubClassC extends Parent {

	public SubClassC() {
		CallingLogger.getInfoLoggerFrom("SubClassC", "subclassC Class Called... ");
	}

}

class SubClassD extends Parent {

	public SubClassD() {
		CallingLogger.getInfoLoggerFrom("SubClassD", "subclassD Class Called... ");
	}

}

class SubClassE extends Parent {

	public SubClassE() {
		CallingLogger.getInfoLoggerFrom("SubClassE", "subclassE Class Called... ");
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