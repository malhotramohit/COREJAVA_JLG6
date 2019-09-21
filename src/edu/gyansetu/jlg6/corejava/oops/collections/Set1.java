package edu.gyansetu.jlg6.corejava.oops.collections;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {

		Set<String> names = new HashSet<>();
		names.add("mohit");

		names.add("rohit");

		names.add("sumit");
		names.add("mohit");

		System.out.println(names);

	}

}
