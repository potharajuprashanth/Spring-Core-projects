package com.prashanth.orders;

import org.springframework.stereotype.Component;


public class Order {

	public Order()
	{
		System.out.println("Order is Createddd......");
	}
	
	private int orderId;
	private String userName;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public void initConfig()
	{
		System.out.println("Bean Initialization Life Cycle Method...............");
	}
	
	public void destroyConfig()
	{
		System.out.println("Bean Destroy Life Cycle Method .................");
	}
	
	
	
	
	
}
