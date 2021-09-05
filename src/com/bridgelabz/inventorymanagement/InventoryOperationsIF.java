package com.bridgelabz.inventorymanagement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public interface InventoryOperationsIF 
{

	public double calculateInventoryTotal(InventoryFactory[] item);
}
