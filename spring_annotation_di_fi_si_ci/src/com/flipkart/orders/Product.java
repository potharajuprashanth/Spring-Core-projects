package com.flipkart.orders;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int id;
	private String name;
	private double price;
	
	
	public Product()
	{
		System.out.println("Product is created ....");
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}
	
	
}
