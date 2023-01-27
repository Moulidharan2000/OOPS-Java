package com.bridgelabz.accountwithdraws;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(100);
		account.debit(50);	
		account.debit(150);
	}
}
