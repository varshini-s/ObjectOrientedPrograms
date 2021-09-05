package com.bridgelabz.inventorymanagement;


public class InventoryManager 
{

	public static void main(String[] args) 

	{

		InventoryFactory[] rice = new InventoryFactory[1];

		rice[0]=new InventoryFactory();
		rice[0].setName("brown rice");
		rice[0].setPricePerKg(10);
		rice[0].setWeight(2);

		InventoryFactory[] wheat = new InventoryFactory[1];
		wheat[0]=new InventoryFactory();

		wheat[0].setName("soft wheat");
		wheat[0].setPricePerKg(200);
		wheat[0].setWeight(4);

		InventoryFactory[] pulses = new InventoryFactory[1];
		pulses[0]=new InventoryFactory();

		pulses[0].setName("beans");
		pulses[0].setPricePerKg(30);
		pulses[0].setWeight(3);

		InventoryOperationsImpl inventoryOperations = new InventoryOperationsImpl();

		System.out.println(inventoryOperations.calculateInventoryTotal(rice));




	}

}
