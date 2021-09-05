package com.bridgelabz.inventorymanagement;


public class InventoryOperationsImpl implements InventoryOperationsIF 
{

	@Override
	public double calculateInventoryTotal(InventoryFactory[] item) 
	{

		double total=0;
		for(int index=0;index<item.length;index++)
		{


			total+=item[index].getPricePerKg()*item[index].getWeight();

		}

		return total;
	}

}
