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


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}
	
	
}
