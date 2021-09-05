package com.bridgelabz.inventorymanagement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.datastructures.MyLinkedList;


public class InventoryFactory 

{

	private String name;
	private int weight;
	private double pricePerKg;


	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getWeight() 
	{
		return weight;
	}

	public void setWeight(int weight) 
	{
		this.weight = weight;
	}

	public double getPricePerKg() 
	{
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg) 
	{
		this.pricePerKg = pricePerKg;
	}





}
