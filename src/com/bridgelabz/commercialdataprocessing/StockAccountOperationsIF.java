package com.bridgelabz.commercialdataprocessing;

import com.bridgelabz.datastructures.MyLinkedList;
import com.bridgelabz.datastructures.MyQueue;
import com.bridgelabz.datastructures.MyStack;
import com.bridgelabz.stockaccountmanagement.Stock;

public interface StockAccountOperationsIF 
{
	public float calculateStockValue(CompanyShares stock,Stock[] stocksList) ;
	public float calculateStockValue(Stock stock) ;
	public float calculateStockValue(Stock[] stocksList) ;
	public void buy(int shares,String symbol,Stock stockList[],CompanyShares node,MyLinkedList<CompanyShares>  obtainedStocks,MyStack< String> purchased ,MyQueue<String> dateTime);
	public void sell(int shares,String symbol,Stock list[],MyStack< String> purchased ,MyQueue<String> dateTime);
	public void printReport(Stock[] stocksList);
	public void printReport(MyLinkedList<CompanyShares>  obtainedStocks,Stock[] stocksList);


}
