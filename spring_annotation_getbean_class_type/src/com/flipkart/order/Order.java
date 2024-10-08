package com.flipkart.order;

import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int id;
	private String userName;
	
	public Order()
	{
		System.out.println("Order is created....");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
