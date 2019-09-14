package edu.gyansetu.jlg6.corejava.oops.exceptionhandling;

public class TestShape {

	public static void main(String[] args) {

		// cannot create objects abstract class
		// Circle ci = new Circle();

		Shape shape = new Circle();
		// parent can have child ka object
		System.out.println("circle area" + shape.getArea());
		shape = new Sqaure();
		System.out.println("sq area" + shape.getArea());

	}

}
