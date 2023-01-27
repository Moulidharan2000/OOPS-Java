package com.bridgelabz.commercialdataprocessing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StocksAccount {
	
	private static List<CompanyShares> companySharesList;
	
	public StocksAccount() {
		companySharesList = new ArrayList<CompanyShares>();
	   	}

	public static void buy(String stockSymbol, int numberOfShares, LocalDateTime transactionDate) {
		boolean stockExists = false;
		for (CompanyShares companyShares : companySharesList) {
			if (companyShares.getStockSymbol().equals(stockSymbol)) {
				stockExists = true;
				companyShares.setNumberOfShares(companyShares.getNumberOfShares() + numberOfShares);
				break;
			}
		}
		if (!stockExists) {
			companySharesList.add(new CompanyShares(stockSymbol, numberOfShares, transactionDate));
		}
	}

	public static void sell(String stockSymbol, int numberOfShares, LocalDateTime transactionDate) {
		for (CompanyShares companyShares : companySharesList) {
			if (companyShares.getStockSymbol().equals(stockSymbol)) {
				if (companyShares.getNumberOfShares() < numberOfShares) {
					System.out.println("Cannot sell shares, not enough shares available");
				} else {
					companyShares.setNumberOfShares(companyShares.getNumberOfShares() - numberOfShares);
	                }
				break;
			}
		}
	}

	public static void printReport() {
		for (CompanyShares companyShares : companySharesList) {
			System.out.println("Stock Symbol: " + companyShares.getStockSymbol() + ", Number of Shares: " + companyShares.getNumberOfShares() + ", Transaction Date: " + companyShares.getTransactionDate());
		}
	}
}

