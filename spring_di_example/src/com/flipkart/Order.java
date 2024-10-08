package com.flipkart;

import java.util.*;

public class Order {
private String emailId;
private float totalAmount;
private boolean isOrderSuccess;
private char foodType;
private long mobileNumber;

private ArrayList<String> foodItemNames;

private List<Double> prices;//by default contaier internally creates the ArrayList object for List





public Order()
{
	System.out.println("Order is Created by the container.....");
}


public String getEmailId() {
	
	return emailId;
}
public void setEmailId(String emailId) {
	System.out.println("setEmailid() id called");
	this.emailId = emailId;
}
public float getTotalAmount() {
	
	return totalAmount;
}
public void setTotalAmount(float totalAmount) {
	System.out.println("setTotalAmount() is called");
	this.totalAmount = totalAmount;
}

public boolean getIsOrderSuccess() {
	return isOrderSuccess;
}


public void setIsOrderSuccess(boolean isOrderSuccess) {
	System.out.println("setOrderSuccess() is called");
	this.isOrderSuccess = isOrderSuccess;
}


public char getFoodType() {
	return foodType;
}
public void setFoodType(char foodType) {
	System.out.println("setFoodType() is called");
	this.foodType = foodType;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	System.out.println("setMobileNumber() is called");
	this.mobileNumber = mobileNumber;
}

public ArrayList<String> getFoodItemNames() {
	return foodItemNames;
}


public void setFoodItemNames(ArrayList<String> foodItemNames) {
	System.out.println("setFoodItemNames() is called");
	this.foodItemNames = foodItemNames;
}
public List<Double> getPrices() {
	return prices;
}


public void setPrices(List<Double> prices) {
	System.out.println("setPrices() List<Double> is called..");
	this.prices = prices;
}


@Override
public String toString() {
	return "Order [emailId=" + emailId + ", totalAmount=" + totalAmount + ", isOrderSuccess=" + isOrderSuccess
			+ ", foodType=" + foodType + ", mobileNumber=" + mobileNumber + ", foodItemNames=" + foodItemNames
			+ ", prices=" + prices + "]";
}




}
