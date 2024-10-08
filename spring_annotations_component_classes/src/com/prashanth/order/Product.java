package com.prashanth.order;

import org.springframework.stereotype.Component;

@Component// not specifying the bean id means default it will consider as the product as Product class name
public class Product {

	public Product()
	{
		System.out.println("Product is instantiated...");
	}
	
}
