package com.bridgelabz.stockaccountmanagement;

public class StockOperationsImpl implements StockOperationsIF
{


	@Override
	public float calculateStockValue(Stock stock) 
	{
		return stock.getSharePrice() * stock.getNumberOfShares();
		

	}

	@Override
	public float calculateStockValue(Stock[] stocksList) 
	{
		float totalStockValue = 0;
		for(int index=0;index<stocksList.length;index++)
		{
			totalStockValue+=calculateStockValue(stocksList[index]);
		}


		return totalStockValue;
	}

	

	
}
