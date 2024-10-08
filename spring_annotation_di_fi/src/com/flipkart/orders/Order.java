package com.flipkart.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order1")
public class Order {
  private int orderId;
  private String uerName;
  
  @Autowired
  private Product product;
  
  public Order()
  {
	  System.out.println("Object is created");
  }
  
  public Product getProduct() {
	return product;
}


public String getUserName()
  {
	  return uerName;
  }
  public int getOrderId()
  {
	  return orderId;
  }
}
