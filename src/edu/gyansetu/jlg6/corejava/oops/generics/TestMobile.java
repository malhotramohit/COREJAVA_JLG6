package edu.gyansetu.jlg6.corejava.oops.generics;

class Mobile implements AndroidInterface, WindowsInterface {

	public void installPlayStore() {
		System.out.println("android interface installed");
	}

	public void installMSOffice() {
		System.out.println("MS Office  installed");

	}
}

public class TestMobile {

	public static void main(String[] args) {
		// AndroidInterface ai = new AndroidInterface();

		Mobile mobile1 = new Mobile();
		mobile1.installPlayStore();
		mobile1.installMSOffice();
	}

}
