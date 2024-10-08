package com.prashanth.order;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("order")
public class Order {
   private int orderID;
   private double price;
   public Order()
   {
	   System.out.println("Order object is created.....");
   }
   
public int getOrderID() {
	return orderID;
}
public void setOrderID(int orderID) {
	this.orderID = orderID;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
   
   
   
}
