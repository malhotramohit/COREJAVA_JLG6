package com.cloudcrunch.hdfc.banking.risk.pack1;

// final methods cannot override
class Parent {

	int age = 99;

	public void doMarriage() {
		System.out.println("DO marriage acc to parents choice");
	}

}

class Child extends Parent {

	int age = 9;

	// write a method in child class with the same name and srguments presnet in
	// parents
	public void doMarriage() {
		System.out.println("DO marriage acc to Childs choice");
		System.out.println("age in child is " + age);// both child and parent are hving same name var
		System.out.println("age in parent is " + super.age);

	}

}

public class MethodOver1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.doMarriage();
		
		//final int height =6;
		
		// final  var
		// final method
		// final class
	}

}
