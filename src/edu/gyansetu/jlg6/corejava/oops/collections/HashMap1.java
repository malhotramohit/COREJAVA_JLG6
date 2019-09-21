package edu.gyansetu.jlg6.corejava.oops.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;;

class Chair {

	private int id;
	private int legs;
	private double price;

	public Chair(int id, int legs, double price) {
		super();
		this.id = id;
		this.legs = legs;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Chair [id=" + id + ", legs=" + legs + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + legs;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chair other = (Chair) obj;
		if (id != other.id)
			return false;
		if (legs != other.legs)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	
	
}

public class HashMap1 {
	public static void main(String[] args) {

		Chair c1 = new Chair(1, 3, 334.33);
		Chair c2 = new Chair(5, 4, 445.33);

		Chair c3 = new Chair(3, 2, 65.33);
		Chair c4 = new Chair(7, 5, 677.33);

		Chair c33 = new Chair(3, 2, 65.33);

		Set<Chair> chairs = new HashSet<>();
		chairs.add(c1);
		chairs.add(c2);

		chairs.add(c3);

		chairs.add(c4);

		chairs.add(c33);

		System.out.println(chairs);

		testHahsmap(c1, c2, c3, c4, c33);

	}

	private static void testHahsmap(Chair c1, Chair c2, Chair c3, Chair c4, Chair c33) {
		Map<Chair, Object> chairMap = new TreeMap<>(new Comparator<Chair>() {

			@Override
			public int compare(Chair o1, Chair o2) {
				return o1.getLegs() - o2.getLegs();
			}

		});

		chairMap.put(c1, c1);
		chairMap.put(c2, c2);

		chairMap.put(c3, c3);

		chairMap.put(c4, c4);

		chairMap.put(c33, c4);

		Set<Map.Entry<Chair, Object>> entries = chairMap.entrySet();

		for (Map.Entry<Chair, Object> chair : entries) {

			System.out.println("key is " + chair.getKey());

		}
	}
}
