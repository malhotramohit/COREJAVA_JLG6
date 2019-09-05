package com.cloudcrunch.hdfc.banking.risk.pack1;

//
class Employee {

	protected String name;
	protected String address;
	long phNo;
	double exp;

}

class Programmer extends Employee {
	int numOfProgLangKnown;
}

public class InheritanceTest {

	public static void main(String[] args) {

		Programmer programmer = new Programmer();
		programmer.name = "some";
		programmer.address = "fdff";
		programmer.exp = 23.45;
		programmer.numOfProgLangKnown = 3;
		System.out.println(programmer.address);
	}

}
