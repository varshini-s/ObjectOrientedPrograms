package com.bridgelabz.stockaccountmanagement;

public class StockPortfolio 
{
	private Stock stock;
	private Stock[] stockList;
	private int totalStocks;
	private int presentNumberOfStocks;
	
	public StockPortfolio(int totalStocks) 
	{
		this.totalStocks=totalStocks;
		stockList= new Stock[totalStocks];
		this.presentNumberOfStocks=0;
	}
	
	
	public Stock[] getStockList() 
	{
		return stockList;
	}

	public void setStockList(Stock[] stockList) 
	{
		this.stockList = stockList;
	}

	public void addStockToList(Stock stock) 
	{
		
		stockList[presentNumberOfStocks]=stock;
		this.presentNumberOfStocks++;
		
		
	}

	public int getNumberOfStocks() 
	{
		return presentNumberOfStocks;
	}

	public void setNumberOfStocks(int numberOfStocks) 
	{
		this.presentNumberOfStocks = numberOfStocks;
	}


	public int getPresentNumberOfStocks() 
	{
		return presentNumberOfStocks;
	}


	public void setPresentNumberOfStocks(int presentNumberOfStocks) 
	{
		this.presentNumberOfStocks = presentNumberOfStocks;
	}

}
