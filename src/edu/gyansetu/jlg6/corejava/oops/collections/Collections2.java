package edu.gyansetu.jlg6.corejava.oops.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections2 {
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("mohit");
		names.add("rohit");
		names.add("ohyam");
		names.add("swaraj");

		// Iterator<String> iterator = names.iterator();
		//
		// while (iterator.hasNext()) {
		// String name = iterator.next();
		// if (name.contains("o")) {
		// System.out.println(names.indexOf(name));
		// }
		// }

		for (String str : names) {
			if (str.contains("o")) {
				names.remove(str);
			}
		}

		System.out.println(names);

	}

}
