package com.flipkarts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {
     
	//@Qualifier not using then exception raise ambiguty while choosing product,product1 then use @Primary at bean object of configuration  
//	@Qualifier("product1") then use this is product1 is injected 
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
