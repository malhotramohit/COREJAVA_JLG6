package com.cloudcrunch.hdfc.banking.risk.test.Wrapper;

public class Wrapper1 {

	// byte
	// short
	// long
	// int
	// float
	// double
	// char
	// boolean

	public static void main(String[] args) {
		// byte: Byte

		// int age = new int();// classes?
		// int object ?

		Integer age = new Integer(23);
		Integer ankitsage = 22;

		System.out.println(age + ankitsage);

		Long phum = 3535353355l;
		System.out.println(phum);

		// Strings to wrapper classes:

		//
		String phoneNum = null;
				//"7869696997 moh 99";
		// check kya num even ?
		// Long mei convert
		// mod 2 ==0 ?
		Long phNum = Long.valueOf(phoneNum);
		if (phNum % 2 == 0) {
			System.out.println("ph is even");
		} else {
			System.out.println("ph is odd");
		}
		
	
	}

}
