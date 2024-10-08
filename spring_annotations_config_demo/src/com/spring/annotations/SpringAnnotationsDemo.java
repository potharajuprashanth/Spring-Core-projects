package com.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {
  
		ApplicationContext container=new AnnotationConfigApplicationContext(com.spring.annotations.BeanConfiguration.class);
	
		Object obj=container.getBean("product1");
		Product p1=(Product)obj;
		System.out.println(p1);
		
		obj=container.getBean("product1");
		Product p2=(Product)obj;
		System.out.println(p2);
		
		obj=container.getBean("product2");
		Product p3=(Product)obj;
		System.out.println(p3);
		obj=container.getBean("order1");
		Order order=(Order)obj;
		order.setAmount(900.0);
		order.setNoOfItems(12);
		order.setOrderId("A202");
		System.out.println("Order object:"+order);
		System.out.println(order.getOrderId());
		System.out.println(order.getNoOfItems());
		System.out.println(order.getAmount());
		
	
	}

}
