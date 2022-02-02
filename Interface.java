package com.OOPSConcepts;

import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate the Interface.
 */
interface Laptop {

	public void laptopDetails();

	public static void price(String name) {
		if (name.equalsIgnoreCase("HP")) {
			System.out.println("HP laptop price 45000 Rs ");
		} else if (name.equalsIgnoreCase("Lenovo")) {
			System.out.println("Lenovo laptop 50000 RS ");
		} else if (name.equalsIgnoreCase("DELL")) {
			System.out.println("Dell laptop 55000 RS ");
		} else {
			System.err.println("!!! Sorry Not available !!!");
		}
	}

}

public class Interface implements Laptop {

	@Override
	public void laptopDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Laptop Company Name: ");
		String laptopBrand = scanner.next();
		Laptop.price(laptopBrand);
		scanner.close();
	}

	public static void main(String[] args) {
		Laptop interFace = new Interface();
		interFace.laptopDetails();
	}

}