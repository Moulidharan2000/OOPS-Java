package com.bridgelabz.accountwithdraws;

public class Account {

	private double balance;
	
	Account(double balance){
		this.balance = balance;
	}
	
	public void debit(double amount) {
		if(amount < balance) {
			System.out.println("Total Account Balance : "+balance);
			balance -= amount;
			System.out.print("Account Balance after Debit : "+balance);
		}
		else
			System.out.println("Debit Amount Exceeded Account Balance");
		System.out.print("Account Balance after Debit : "+balance);
	}
	
	public double getBalance() {
		return balance;
	}
}

