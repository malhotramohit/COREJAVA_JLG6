package com.cloudcrunch.hdfc.banking.risk.test.Strings;

public class String1 {
	public static void main(String[] args) {

		String fName = "Mohit";
		String lName = "Malhotra";
		String LNAME = "MALHOTRA";

		// concat : 1) + , 2) concat
		String fullName = fName + lName;
		System.out.println(fullName);

		// Mohit : {M,o,h,i,t}
		// indexOf
		int index = fName.indexOf('h');
		System.out.println("index of h is " + index);

		// charAt
		char c = lName.charAt(5);
		System.out.println("char at 5 index is " + c);

		int size = lName.length();
		System.out.println("len of lname is " + size);

		if (lName.contains("hot")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		if (lName.equalsIgnoreCase(LNAME)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		String firstHalf = LNAME.substring(0, 3);
		System.out.println(firstHalf);

		String username = "   mmalhotra200   ";
		// trim
		System.out.println(username.trim() + "some data");

		System.out.println(fName.replace('M', 'R'));

		if (lName.startsWith("M")) {
			System.out.println("yes it starts with M");
		}

	}

}
