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

	@Override
	public void printReport(Stock[] stocksList) 
	{
		for(int index=0;index<stocksList.length;index++)
		{
			Stock stock=stocksList[index];
			System.out.println("name of stock: "+stock.getName());
			System.out.println("number of shares :"+stock.getNumberOfShares());
			System.out.println("share price: "+stock.getSharePrice());
			System.out.println("total stock value this stock: "+calculateStockValue(stock));
			System.out.println("-------------------------------------------------------------");
			
		}
		System.out.println("Total stock value of all stocks: "+calculateStockValue(stocksList));

		
	}

	
}
