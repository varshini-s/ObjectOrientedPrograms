package com.bridgelabz.stockaccountmanagement;

public class Stock 

{

	private String name;
	private int numberOfShares;
	private float sharePrice;

	public Stock( String name, int numberOfShares, float sharePrice) 
	{
		this.name=name;
		this.numberOfShares=numberOfShares;
		this.sharePrice=sharePrice;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getNumberOfShares() 
	{
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) 
	{
		this.numberOfShares = numberOfShares;
	}

	public float getSharePrice() 
	{
		return sharePrice;
	}

	public void setSharePrice(float sharePrice) 
	{
		this.sharePrice = sharePrice;
	}



}
