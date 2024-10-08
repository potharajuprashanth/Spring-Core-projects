package com.flipkart.orders;

public class Product {

	
	private int productId;
	private double amount;
	private String name;
	
	public Product()
	{
		System.out.println("Product object created...");
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		System.out.println("setter method for amount executed");
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
