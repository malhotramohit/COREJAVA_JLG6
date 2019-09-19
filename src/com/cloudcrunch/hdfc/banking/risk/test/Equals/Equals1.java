package com.cloudcrunch.hdfc.banking.risk.test.Equals;

public class Equals1 {

	public static void main(String[] args) {

		Table table1 = new Table(1, 23);

		Table table2 = new Table(1, 23);

		System.out.println("address of table1 is " + table1.hashCode());
		System.out.println("address of table2 is " + table2.hashCode());

		if (table1.equals(table2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

	}

}
