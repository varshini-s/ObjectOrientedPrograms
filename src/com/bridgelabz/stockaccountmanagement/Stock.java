package com.bridgelabz.stockaccountmanagement;

public class Stock 

{

	private String name;
	private int NUMBER;
	private float sharePrice;

	public Stock( String name, int numberOfShares, float sharePrice) 
	{
		this.name=name;
		this.NUMBER=numberOfShares;
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
		return NUMBER;
	}

	public void setNumberOfShares(int numberOfShares) 
	{
		this.NUMBER = numberOfShares;
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
