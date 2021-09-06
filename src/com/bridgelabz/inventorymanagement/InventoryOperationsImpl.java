package com.bridgelabz.inventorymanagement;


public class InventoryOperationsImpl implements InventoryOperationsIF 
{

	@Override
	public double calculateInventoryTotal(InventoryFactory inventoryItem) 
	{
		return inventoryItem.getPricePerKg()*inventoryItem.getWeight();
	}

}
