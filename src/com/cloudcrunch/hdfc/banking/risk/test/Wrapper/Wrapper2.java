package com.cloudcrunch.hdfc.banking.risk.test.Wrapper;

public class Wrapper2 {

	public static void main(String[] args) {
		// -128-127 :cache
		// 1000
		// 230:1000
		// 230 : 2000

		Integer integer1 = 231;
		Integer integer2 = 230;

		if (integer1.equals(integer2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
	}

}
