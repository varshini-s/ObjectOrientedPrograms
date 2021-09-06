package com.bridgelabz.inventorymanagement;

import java.util.Scanner;

import com.bridgelabz.datastructures.MyLinkedList;
import com.bridgelabz.datastructures.MyNode;

public class InventoryManager
{

	public static void main(String[] args) 

	{
		Scanner scanner = new Scanner(System.in);

		MyLinkedList<InventoryFactory> inventoryList = new MyLinkedList<InventoryFactory>();
		InventoryFactory rice = new InventoryFactory();

		rice.setName("Rice");
		System.out.println("enter price perkg  of"+rice.getName());
		rice.setPricePerKg(scanner.nextInt());
		System.out.println("enter weight ");
		rice.setWeight(scanner.nextInt());
		MyNode<InventoryFactory> item1 = new MyNode<InventoryFactory>(rice);

		inventoryList.appendNode(item1);

		InventoryFactory wheat = new InventoryFactory();

		wheat.setName("Wheat");
		System.out.println("enter price perkg  of"+wheat.getName());
		wheat.setPricePerKg(scanner.nextInt());
		System.out.println("enter weight ");
		wheat.setWeight(scanner.nextInt());
		MyNode<InventoryFactory> item2 = new MyNode<InventoryFactory>(wheat);

		inventoryList.appendNode(item2);

		InventoryFactory pulse = new InventoryFactory();

		pulse.setName("Pulse");
		System.out.println("enter price perkg  of"+pulse.getName());
		pulse.setPricePerKg(scanner.nextInt());
		System.out.println("enter weight ");
		pulse.setWeight(scanner.nextInt());
		MyNode<InventoryFactory> item3 = new MyNode<InventoryFactory>(pulse);

		inventoryList.appendNode(item3);

		InventoryOperationsImpl inventoryOperations = new InventoryOperationsImpl();

		
		for(int index=0;index<inventoryList.size();index++)
		{
			InventoryFactory inventoryItem=inventoryList.getNode(index).getKey();
	
			System.out.println("Inventory total of :"+inventoryItem.getName()+" is "+inventoryOperations.calculateInventoryTotal(inventoryItem));
		}

		scanner.close();

	}

}
