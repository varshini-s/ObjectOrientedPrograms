package com.bridgelabz.commercialdataprocessing;


public class CompanyShares 
{
	private String name;
	private int numberOfShares;

	public CompanyShares( String name, int numberOfShares) 
	{
		this.name=name;
		this.numberOfShares=numberOfShares;
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



	
	
}
