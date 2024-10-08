package com.flipkarts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDIOFFi {

	public static void main(String[] args) {
  
		AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();
		
		
		Order order=container.getBean(Order.class);
	    Product product=(Product)container.getBean("product");//defaault prodcu object injected into order
	    
	    Product product1=(Product)container.getBean("product1");
		
	    System.out.println(order);
	    System.out.println("Primary product object in order======"+order.getProduct());
	    System.out.println("product object in product======:"+product);
	    System.out.println("product2 object in product===="+product1);
	    
	    
	    
	}

}
