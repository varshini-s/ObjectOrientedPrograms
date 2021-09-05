package com.bridgelabz.commercialdataprocessing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import com.bridgelabz.datastructures.INodeIF;
import com.bridgelabz.datastructures.MyLinkedList;
import com.bridgelabz.datastructures.MyNode;
import com.bridgelabz.datastructures.MyQueue;
import com.bridgelabz.datastructures.MyStack;
import com.bridgelabz.stockaccountmanagement.Stock;

public class StockAccountOperationsImpl implements StockAccountOperationsIF
{


	public float calculateStockValue(CompanyShares stock,Stock[] stocksList) 
	{
		
		for(int index=0;index<stocksList.length;index++)
		{
			if(stocksList[index].getName().equals(stock.getName()))
			{
				return stock.getNumberOfShares()*stocksList[index].getSharePrice();
			}
			
		}
		

		return 0;

	}
	
	public float calculateStockValue(Stock stock) 
	{
		return stock.getSharePrice() * stock.getNumberOfShares();


	}
	
	


	public float calculateStockValue(Stock[] stocksList) 
	{
		float totalStockValue = 0;
		for(int index=0;index<stocksList.length;index++)
		{
			totalStockValue+=calculateStockValue(stocksList[index]);
		}


		return totalStockValue;
	}

	public void buy(int shares,String symbol,Stock stockList[],CompanyShares node,MyLinkedList<CompanyShares>  obtainedStocks,MyStack< String> purchased ,MyQueue<String> dateTime)
	{
		for(int index=0;index<stockList.length;index++)
		{
			if(stockList[index].getName().equals(symbol))
			{
				if(stockList[index].getNumberOfShares()>=shares)
				{

					for(int sharesListIndex=0;sharesListIndex<obtainedStocks.size();sharesListIndex++)
					{

						if(obtainedStocks.search(node)!=null)
						{
							obtainedStocks.search(node).getKey().setNumberOfShares(shares+obtainedStocks.search(node).getKey().getNumberOfShares());
							stockList[index].setNumberOfShares(stockList[index].getNumberOfShares()-shares);

						}
						else
						{
							MyNode<CompanyShares> newNode = new MyNode<CompanyShares>(node);
							obtainedStocks.appendNode(newNode);

						}

						
					}

				}

			}

		}
		obtainedStocks.toString();


	}
	public void sell(int shares,String symbol,Stock list[],MyStack< String> stack ,MyQueue<String> dateTime)
	{

		for(int sharesListIndex=0;sharesListIndex<list.length;sharesListIndex++)
		{
			if(list[sharesListIndex].getName().endsWith(symbol))
			{
				if(list[sharesListIndex].getNumberOfShares()>=shares)
				{

					list[sharesListIndex].setNumberOfShares(list[sharesListIndex].getNumberOfShares()-shares);
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  

					LocalDateTime now = LocalDateTime.now();  

					MyNode<String > myNode = new MyNode<String>(dtf.format(now));
					dateTime.enqueue(myNode);

					myNode = new MyNode<String>(symbol);
					stack.push(myNode);
				}


			}

		}

	}


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

	public void printReport(MyLinkedList<CompanyShares>  obtainedStocks,Stock[] stocksList)
	{
		System.out.println("Stocks obtained:-----------");
		
		for(int index=0;index<obtainedStocks.size();index++)
		{
			CompanyShares stock=obtainedStocks.pop().getKey();
			
			System.out.println("name of stock: "+stock.getName());
			System.out.println("number of shares :"+stock.getNumberOfShares());
			System.out.println("total stock value this stock: "+calculateStockValue(stock,stocksList));

			System.out.println("-------------------------------------------------------------");

			
		}
		
	
	}








}
