package com.cloudcrunch.hdfc.banking.risk.test;

public class Wallet {

	// id long
	// color String
	// price double
	// size int
	private long id; // instance variable
	private String color;
	private double price;
	public int size; // No access modifier : default : package private

	public Wallet(long id, String color, double price, int size) {
		this.id = id;
		this.color = color;
		this.price = price;
		this.size = size;
	}

	public long getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

}
