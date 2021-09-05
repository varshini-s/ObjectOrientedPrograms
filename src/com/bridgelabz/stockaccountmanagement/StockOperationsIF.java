package com.bridgelabz.stockaccountmanagement;

public interface StockOperationsIF 
{
	
	public float calculateStockValue(Stock stock);
	public float calculateStockValue(Stock[] stocksList);
	public void printReport(Stock[] stocksList);


	
	
	

}
