package edu.gyansetu.jlg6.corejava.oops.pojo;

public class Circle {

	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		// 34.89 , Red
		// Circle[radius = 34.89 , color = Red]
		return "Circle[radius = " + radius + ", color =" + color + "]";
		//return  "Mohit";
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
