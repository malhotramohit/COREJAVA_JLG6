package com.cloudcrunch.hdfc.banking.risk.test.Strings;

public class String2 {

	public static void main(String[] args) {
		String fname = "Mohit";

		String lname = new String("Ankit");

		String st1 = new String("abc");
		// st1 : 1000
		String st2 = new String("abc");
		// st2 : 2000
		// ref: 1000==2000 wrong
		// internal values check
		if (st1.equals(st2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		String address = "Gyansetu sec31";
		// string pe :
		// try mutate a string
		// new string
		// immutable
		address = address.replace("G", "H"); // return a new string

		System.out.println(address);

	}

}
