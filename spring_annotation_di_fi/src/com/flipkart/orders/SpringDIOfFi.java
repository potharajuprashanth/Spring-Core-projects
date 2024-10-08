package com.flipkart.orders;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDIOfFi {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
		
		container.scan("com.*");
		container.refresh();
		
		Object obj=container.getBean("order1");
		Order order1=(Order)obj;
		
		System.out.println(order1);
		System.out.println("orderid:"+order1.getOrderId());
		System.out.println("orderusername:"+order1.getUserName());
		
		
		
		 obj=container.getBean("product");
			
		 Product product1=(Product)obj;
		   product1.setId(101);
		   product1.setName("Prashanth");
		   product1.setPrice(9009);
		   
		
		 System.out.println("product details from product .....");
		 System.out.println(product1);
			System.out.println("productid:"+product1.getId());
			System.out.println("productname:"+product1.getName());
			System.out.println("productprice:"+product1.getPrice());
			
			
			Product produc11=order1.getProduct();
			System.out.println("product details accessing from order..... ");
		System.out.println(produc11);
		System.out.println("productid:"+order1.getProduct().getId());
		System.out.println("productname:"+order1.getProduct().getName());
		System.out.println("productprice:"+order1.getProduct().getPrice());
		
		
		
		System.out.println("======Flipkart Info===========");
		
		Flipkart flipkart=container.getBean(Flipkart.class);
		System.out.println(flipkart);
		System.out.println("Order1: "+flipkart.getOrder1());
		System.out.println("Order2 :"+flipkart.getOrder2());
		System.out.println("==Product details Accessing from Flipkart====");
		System.out.println("productId:"+flipkart.getOrder1().getProduct().getId());
		System.out.println("productName:"+flipkart.getOrder1().getProduct().getName());
		System.out.println("ProductPrice:"+flipkart.getOrder1().getProduct().getPrice());
		
		
	}

}
