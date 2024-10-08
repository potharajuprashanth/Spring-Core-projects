package com.prashanth.orders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringLifeCycleMethodXml {

	public static void main(String[] args) {

		System.out.println("Spring container is Getting Ready.....");
		
	ApplicationContext	 container =new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\spring_life_cycle_methods_xml\\beans.xml");
		
		Order order1=(Order)container.getBean("order");
		
		System.out.println(order1);
		System.out.println(order1.getOrderId());
		System.out.println(order1.getUserName());
		
		System.out.println("Order is Utilized........");
		
		
		System.out.println("Container Getting closed......");
		((AbstractApplicationContext) container).close();
		System.out.println("Container is Closed Ater destroy() is executedd......");
		
		
	}

}
