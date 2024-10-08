package com.flipkart.order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringGetBeanClassTypeDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
		
		container.scan("com.*");//container will scan the component classes in the com.* packages
		//container.register(Order.class);
		container.refresh();
		Order order1=container.getBean(Order.class);//No need of Type casting here directly give the Order type 
		//it is equvialent to the autowire="byType" means only one object creation it will valid
		//we can access for only one object
		System.out.println(order1);
		
		//if we create another object using @Bean then the container will confuse and throw the exception
		
		//i.e. getOrderTwo() created
		//2 objects created
		//but could not access then exception throw
		
		
	}

}
