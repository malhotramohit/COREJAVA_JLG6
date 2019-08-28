package edu.gyansetu.jlg6.corejava.oops.pojo;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle1 = new Circle(10, "Black");
		// PRINTLN makes a call
		// to toString()
		System.out.println(circle1);
		
		System.out.println(circle1.getArea());
	}

}
