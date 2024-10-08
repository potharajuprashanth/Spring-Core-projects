package com.flipkart.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
  @Autowired
  Order order1;
  
  @Autowired
  Order order2;
  
  public Flipkart()
  {
	  System.out.println("Flipkart Is Created....");
  }
  
public Order getOrder1() {
	return order1;
}
public void setOrder1(Order order1) {
	this.order1 = order1;
}
public Order getOrder2() {
	return order2;
}
public void setOrder2(Order order2) {
	this.order2 = order2;
}
  
	
}
