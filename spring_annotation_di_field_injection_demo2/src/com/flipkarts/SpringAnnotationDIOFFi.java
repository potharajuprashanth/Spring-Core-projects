package com.flipkarts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDIOFFi {

	public static void main(String[] args) {
  
		AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();
		
		
		Order order=container.getBean(Order.class);
		System.out.println(order);
		System.out.println(order.getProduct());
		
		/*
		 * Product product1=container.getBean(Product.class);
		 * System.out.println("product1 object/bean id:"+product1);
		 */
		//whene use this exception will come while accessing the bean id from the container ambiguty problem
		Object obj=container.getBean("product");
		Product product1=(Product)obj;
		System.out.println("product1 bean/object id:    "+product1);
		
		obj=container.getBean("product2");
		Product product2=(Product)obj;
		System.out.println("product2 bean/object id:    "+product2);
				
	}

}
