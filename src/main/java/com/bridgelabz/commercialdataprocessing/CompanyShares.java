package com.bridgelabz.commercialdataprocessing;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CompanyShares {
	
	private String stockSymbol;
	private int numberOfShares;
	private static LocalDateTime transactionDate;
	
	public CompanyShares(String stockSymbol, int numberOfShares, LocalDateTime transactionDate) {
		this.stockSymbol = stockSymbol;
		this.numberOfShares = numberOfShares;
		this.transactionDate = transactionDate;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}
	
	public int getNumberOfShares() {
		return numberOfShares;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Stock Symbol : ");
		String stockSymbol = scan.next();
		System.out.print("Enter the Number of Shares : ");
		int numberofShares = scan.nextInt();
		
		StocksAccount.buy(stockSymbol, numberofShares, transactionDate);
		StocksAccount.sell(stockSymbol, numberofShares, transactionDate);
		StocksAccount.printReport();
	}
}

	
