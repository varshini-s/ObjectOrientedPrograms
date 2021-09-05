package com.bridgelabz.commercialdataprocessing;

import com.bridgelabz.stockaccountmanagement.StockPortfolio;

public class StockAccount

{

	private final String name;     
	private double balance;          

	private StockPortfolio list;


	public StockAccount(String name,double balance) 
	{
		this.name=name;
		this.balance=balance;

	}


	public double getBalance() 
	{
		return balance;
	}


	public void setBalance(double balance) 
	{
		this.balance = balance;
	}


	public StockPortfolio getList() 
	{
		return list;
	}


	public void setList(StockPortfolio list) 
	{
		this.list = list;
	}


	public String getName() 
	{
		return name;
	}



}
