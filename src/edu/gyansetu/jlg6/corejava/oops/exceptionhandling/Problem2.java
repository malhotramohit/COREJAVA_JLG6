package edu.gyansetu.jlg6.corejava.oops.exceptionhandling;

class MyInteger {
	int val;
}

public class Problem2 {
	public static void main(String[] args) {
		MyInteger res = div(4, 0);
		System.out.println("Final value of res received : " + res.val);
	}

	public static MyInteger div(int a, int b) {
		MyInteger res = new MyInteger();
		try {
			res.val = a / b;
		} catch (ArithmeticException e) {
			res.val = 99;
			System.out.println("Inside catch : res value is : " + res.val);
			return res;
		} finally {
			res.val = 999;
			System.out.println("Inside finally : res value is : " + res.val);
		}
		
		res.val =8;
		return res;
	}
}

