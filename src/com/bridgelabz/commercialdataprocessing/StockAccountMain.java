package com.bridgelabz.commercialdataprocessing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.bridgelabz.datastructures.MyLinkedList;
import com.bridgelabz.datastructures.MyNode;
import com.bridgelabz.datastructures.MyQueue;
import com.bridgelabz.datastructures.MyStack;
import com.bridgelabz.stockaccountmanagement.Stock;
import com.bridgelabz.stockaccountmanagement.StockPortfolio;

public class StockAccountMain
{

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);


		StockPortfolio portfolio = new StockPortfolio(2);
		StockPortfolio stockList = new StockPortfolio(2);


		MyLinkedList<Stock> companyShares = new MyLinkedList<Stock>();
		MyStack< String> purchased = new MyStack<String>();
		MyStack< String> sold = new MyStack<String>();
		MyQueue<String> dateTime = new MyQueue<String>();


		Stock stock= new Stock("abc", 3, 2000);
		portfolio.addStockToList(stock);


		stock= new Stock("zzz", 5, 2000);
		portfolio.addStockToList(stock);



		System.out.println("enter name of account");
		String name=scanner.next();

		System.out.println("enter balance of account");
		int balance=scanner.nextInt();

		StockAccount account = new StockAccount(name, balance);
		account.setList(stockList);

		StockAccountOperationsImpl operations  = new StockAccountOperationsImpl();

		System.out.println("enter company and shares to buy from");
		String symbol = scanner.next();
		int shares = scanner.nextInt();

		




	}

}
