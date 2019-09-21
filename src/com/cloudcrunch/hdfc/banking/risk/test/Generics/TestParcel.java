package com.cloudcrunch.hdfc.banking.risk.test.Generics;

class Parcel<T> {

	private T obj;

	public Parcel(T obj) {
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

public class TestParcel {

	public static void main(String[] args) {

		Book b1 = new Book();

		Parcel<Book> bookParcel = new Parcel<Book>(b1);

		

	}

}
