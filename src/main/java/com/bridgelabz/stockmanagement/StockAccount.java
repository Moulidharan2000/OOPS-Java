package com.bridgelabz.stockmanagement;

import java.util.Scanner;

public class StockAccount {

		String name;
	    int shares;
	    double price;
	    double value;

	    public StockAccount(String name, int shares, double price) {
	        this.name = name;
	        this.shares = shares;
	        this.price = price;
	        this.value = shares * price;
	    }

	public static void main(String[] args) {
		
		StockPortfolio portfolio = new StockPortfolio();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of stocks: ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter stock name: ");
			String name = scan.next();
			System.out.print("Enter number of shares: ");
			int shares = scan.nextInt();
			System.out.print("Enter share price: ");
			double price = scan.nextDouble();
			StockAccount stock = new StockAccount(name, shares, price);
			portfolio.addStock(stock);
		}
		portfolio.printReport();
    }
}

