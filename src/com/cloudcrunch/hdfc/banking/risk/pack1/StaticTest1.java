package com.cloudcrunch.hdfc.banking.risk.pack1;

class ClassRoom {

	static String UNIVERSITY_NAME = "GyanSetu";
	private int roomNo;
	private String name;

	ClassRoom(int roomNo, String name) {
		this.roomNo = roomNo;
		this.name = name;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StaticTest1 {

	public static void main(String[] args) {

		ClassRoom cr1 = new ClassRoom(23, "IT");

		ClassRoom cr2 = new ClassRoom(35, "JAVA");

		System.out.println(cr1.getName());

		System.out.println(ClassRoom.UNIVERSITY_NAME);

		cr1.UNIVERSITY_NAME = "Virus";
		cr1.setName("Virus");

		System.out.println(cr2.UNIVERSITY_NAME);
		System.out.println(cr2.getName());


	}

}
