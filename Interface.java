package com.oopsconcepts;

import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate The Interface.
 */
interface Laptop {

	public abstract void laptopDetails();

	public static void price(String name) {
		String className = "Laptop";
		if (name.equalsIgnoreCase("HP")) {
			CallingLogger.getInfoLoggerFrom(className, "HP laptop price 45000 Rs ");
		} else if (name.equalsIgnoreCase("Lenovo")) {
			CallingLogger.getInfoLoggerFrom(className, "Lenovo laptop 50000 RS ");
		} else if (name.equalsIgnoreCase("DELL")) {
			CallingLogger.getInfoLoggerFrom(className, "Dell laptop 55000 RS ");
		} else {
			CallingLogger.getInfoLoggerFrom(className, "!!! Sorry Not available !!!");
		}
	}

}

public class Interface implements Laptop {

	@Override
	public void laptopDetails() {
		Scanner scanner = new Scanner(System.in);
		CallingLogger.getInfoLoggerFrom("Interface", "Enter Your Laptop Company Name: ");
		String laptopBrand = scanner.next();
		Laptop.price(laptopBrand);
		scanner.close();
	}

	public static void main(String[] args) {
		Laptop interFace = new Interface();
		interFace.laptopDetails();
	}

}