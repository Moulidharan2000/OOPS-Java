package com.bridgelabz.stockmanagement;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
	
	List<StockAccount> stocks;
    double totalValue;

    public StockPortfolio() {
        this.stocks = new ArrayList<>();
        this.totalValue = 0;
    }

    public void addStock(StockAccount stock) {
        stocks.add(stock);
        totalValue += stock.value;
    }

    public void printReport() {
        for (StockAccount stock : stocks) {
            System.out.println("Stock Name: " + stock.name);
            System.out.println("Number of Shares: " + stock.shares);
            System.out.println("Share Price: " + stock.price);
            System.out.println("Stock Value: " + stock.value);
            System.out.println();
        }
        System.out.println("Total Stock Value: " + totalValue);
    }
}
