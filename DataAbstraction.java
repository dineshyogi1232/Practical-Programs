package com.oopsconcepts;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate DataAbstraction Program
 */
abstract class Shape {

	String color = null;

	public abstract double area();

	public abstract String toGetShape();

	protected Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}

class Circle extends Shape {

	double radius;

	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toGetShape() {
		return "Circle color is " + super.getColor() + "and area is : " + area();
	}

}

class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public String toGetShape() {
		return "Rectangle color is " + super.getColor() + " and area is : " + area();
	}

}

public class DataAbstraction {

	public static void main(String[] args) {
		Shape shape1 = new Circle("Black", 8.2);
		Shape shape2 = new Rectangle("White", 5, 6);
		System.out.println(shape1.toGetShape());
		System.out.println(shape2.toGetShape());
	}

}