package edu.gyansetu.jlg6.corejava.oops.wrapper;

interface MyComparable<T> {

	int compareTo(T t);
}

class Human implements MyComparable<Human> {
	int id;
	String name;

	@Override
	public int compareTo(Human t) {
		return this.id - t.id;
	}

}

public class GenericLS {
	public static void main(String[] args) {

		Integer[] arr = { 2, 3, -9, -6, 4, 5, 6 };

		int num = 4;

		int index = linearSearch(arr, num);
		if (index != -1) {
			System.out.println("found at " + index);
		} else {
			System.out.println("not found");
		}

		Human[] humans = new Human[5];

		sort(humans);

	}

	public static <T extends MyComparable> void sort(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].compareTo(arr[i + 1]) > 1) {
				// swap
			}
		}
	}

	private static int linearSearch(Object[] arr, Object num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(num)) {
				return i;
			}
		}
		return -1;
	}
}
