package edu.gyansetu.jlg6.corejava.oops.exceptionhandling;

public class Exp1 {
	public static void main(String[] args) {

		System.out.println("before exp");

		int[] arr = { 434, 4 };

		int index = 3;

		if (index < arr.length) {
			System.out.println(arr[index]);
		}

		int a = 9;
		int b = 0;
		if (b != 0) {
			System.out.println(a / b);
		}

		System.out.println("after exp");

	}

}
