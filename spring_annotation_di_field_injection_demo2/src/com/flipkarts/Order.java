package com.flipkarts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {
     
	@Qualifier("product2")//it's like autowire="byName"
	@Autowired
	 private Product product;

	 
	 public Order()
	 {
		 System.out.println("Order is Instantiated......");
	 }
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	 
	 
}
