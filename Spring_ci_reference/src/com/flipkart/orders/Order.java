package com.flipkart.orders;

import java.util.List;
import java.util.Map;

public class Order {

	private int orderId;
	private String name;
	private boolean isOrderSuccess;
	private Character foodType;
	private List<String> foodItemNames;
	private Map<String,Double> prices;
	
	
	
	public Order() {
		System.out.println("Order executed Default constructor for setter methods...");
	}
	

	public Order(int orderId, String name, boolean isOrderSuccess) {
		
		super();
		System.out.println("Order(id,name,isOrderSuccess) 3 params created");
		
		this.orderId = orderId;
		this.name = name;
		this.isOrderSuccess = isOrderSuccess;
	}
	
	
	
	
	
	public Order(Character foodType, List<String> foodItemNames) {
		super();
		System.out.println("Order(foodType,foodItemNames) 2 params created");
		this.foodType = foodType;
		this.foodItemNames = foodItemNames;
	}





	public Order(int orderId, String name, boolean isOrderSuccess, Character foodType, List<String> foodItemNames) {
		super();
		System.out.println("Order(id,name,isOrderSuccess,foodType,foodItemNames) 5 params created");
		this.orderId = orderId;
		this.name = name;
		this.isOrderSuccess = isOrderSuccess;
		this.foodType = foodType;
		this.foodItemNames = foodItemNames;
	}





	public Order(List<String> foodItemNames, Map<String, Double> prices) {
		super();
		System.out.println("Order(foodItemNames,prices) 2 params created");
		this.foodItemNames = foodItemNames;
		this.prices = prices;
	}


	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOrderSuccess() {
		return isOrderSuccess;
	}
	public void setOrderSuccess(boolean isOrderSuccess) {
		this.isOrderSuccess = isOrderSuccess;
	}
	public Character getFoodType() {
		return foodType;
	}
	public void setFoodType(Character foodType) {
		this.foodType = foodType;
	}
	public List<String> getFoodItemNames() {
		return foodItemNames;
	}
	public void setFoodItemNames(List<String> foodItemNames) {
		this.foodItemNames = foodItemNames;
	}





@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", isOrderSuccess=" + isOrderSuccess + ", foodType="
				+ foodType + ", foodItemNames=" + foodItemNames + "]";
	}


public Map<String, Double> getPrices() {
	return prices;
}


public void setPrices(Map<String, Double> prices) {
	this.prices = prices;
}
	

	
}
