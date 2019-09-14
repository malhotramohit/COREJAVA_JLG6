package edu.gyansetu.jlg6.corejava.oops.wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		Integer i = Integer.valueOf("47");
		Long l = Long.valueOf("578587");

		Integer i1 = 100;
		Integer i2 = 100;

		if (i1 == i2) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		int ii = i; // wrapper se prim
		i1 = ii;
		// Character c = Character.valueOf("a");

		Long ll = Long.parseLong(null);
		
		Boolean.parseBoolean("TrUe");
		
		
		Double d1 =34.77;
		Double d2=899.33;
		
		
		

	}

}
