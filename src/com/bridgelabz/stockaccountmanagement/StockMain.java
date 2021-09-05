package com.bridgelabz.stockaccountmanagement;

import java.util.Scanner;

public class StockMain {

	public static void main(String[] args) 
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of stocks");
		int numberOfStocks=scanner.nextInt();
		
		StockPortfolio portfolio = new StockPortfolio(numberOfStocks);
		
		for(int index=0;index<numberOfStocks;index++)
		{
			System.out.println("enter Stock name ");
			String name=scanner.next();
			System.out.println("enter number of shares");
			int numberOfShare=scanner.nextInt();
			System.out.println("enter the price of share");
			int sharePrice = scanner.nextInt();
			
			Stock stock= new Stock(name, numberOfShare, sharePrice);
			portfolio.addStockToList(stock);
			
			
		}
		
		StockOperationsImpl stockOperations = new StockOperationsImpl();
		
		stockOperations.printReport(portfolio.getStockList());
		

	}

}
