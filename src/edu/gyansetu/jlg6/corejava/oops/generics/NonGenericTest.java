package edu.gyansetu.jlg6.corejava.oops.generics;

class Parcle<T> {

	private T obj;

	public Parcle(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}

class Book {

}

class Pen {

}

class Wheel {

}

class FordWheel extends Wheel {

}

public class NonGenericTest {

	public static void main(String[] args) {

		Wheel w = new FordWheel();

		int num = 900;
		byte b = (byte) num;

		Parcle<Pen> parcel1 = new Parcle<Pen>(new Pen());

		// Book book1 = parcel1.getObj();

		// if (parcel1.getObj() instanceof Book) {
		// Book book1 = (Book) parcel1.getObj();
		// System.out.println(book1);
		// }

	}

}
