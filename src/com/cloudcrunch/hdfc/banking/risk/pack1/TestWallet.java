package com.cloudcrunch.hdfc.banking.risk.pack1;

import com.cloudcrunch.hdfc.banking.risk.test.Wallet;

public class TestWallet {

	
	public static void main(String[] args) {
		
		Wallet wallet1 = new Wallet(1, "Red", 223.232, 34);
		
		System.out.println(wallet1.size);
		System.out.println(wallet1.getPrice());

	}
}
