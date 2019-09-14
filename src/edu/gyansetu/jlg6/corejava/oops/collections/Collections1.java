package edu.gyansetu.jlg6.corejava.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;;

class Book {
	private int id;
	private String name;
	private double price;

	public Book(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

}

class BookIdComaparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return o1.getId() - o2.getId();
	}

}

class BookNameComaparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return o2.getName().compareTo(o1.getName());
	}

}

public class Collections1 {
	public static void main(String[] args) {
		// arraylist : dynamic array
		// linked list
		// stack queue

		// non linear
		// hashset : no dup : order
		// linkedhashset
		// treeset
		// hashmaps
		// linkedHashmap
		// treemap

		Book b1 = new Book(1, "book2", 3433.34);
		Book b2 = new Book(3, "book67", 43434.34);
		Book b3 = new Book(3, "Java", 232.34);
		Book b4 = new Book(4, "J2EE", 676767.34);
		Book b5 = new Book(5, "Web", 567.34);
		Book b55 = new Book(5, "Web", 567.34);

		// ArrayList Dynamic array
		// Book[] books = new Book[3];

		// 1) new array double the size
		// 2) copy

		// add()
		// get()
		// set()
		// add()

		List<Book> books = new LinkedList<>();
		// new ArrayList<>(5);

		PriorityQueue<Book> books3 = new PriorityQueue<Book>();

		books3.add(b1);
		books3.add(b2);
		books3.add(b3);
		books3.add(b4);
		System.out.println(books3);

		practiceList(b1, b2, b3, b4, b5, b55, books);

		Stack<Book> stackOfBooks = new Stack<>();
		stackOfBooks.push(b1);
		stackOfBooks.push(b2);
		stackOfBooks.push(b3);
		stackOfBooks.push(b4);

		LinkedList<Book> books2 = new LinkedList<Book>();

	}

	private static void practiceList(Book b1, Book b2, Book b3, Book b4, Book b5, Book b55, List<Book> books) {
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);

		books.add(2, new Book(89, "c++", 3434.343));
		Book oldBook = books.set(4, new Book(98, "b++", 3434.343));

		System.out.println("before remove(2)");

		displayArrayListDetails(books);

		System.out.println("bool rep is " + oldBook);

		// books.remove(2);

		// books.remove(b2);

		books.remove(b55);

		System.out.println("after remove(2)");

		displayArrayListDetails(books);

		Collections.sort(books, (o1, o2) -> {
			return o1.getId() - o2.getId();
		});

		Collections.sort(books, Comparator.comparing(Book::getId).thenComparing(Book::getPrice).reversed());

		System.out.println("after soting");
		displayArrayListDetails(books);
	}

	private static void displayArrayListDetails(List<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
	}

}
