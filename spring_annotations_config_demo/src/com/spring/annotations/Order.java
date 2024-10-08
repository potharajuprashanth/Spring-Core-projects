package com.spring.annotations;

public class Order {
private String orderId;
private int noOfItems;
private Double amount;

public Order()
{
	System.out.println("Order is created For Default constructor");
}

public String getOrderId() {
	return orderId;
}

public void setOrderId(String orderId) {
	this.orderId = orderId;
}

public int getNoOfItems() {
	return noOfItems;
}

public void setNoOfItems(int noOfItems) {
	this.noOfItems = noOfItems;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}


}
