package com.flipkart.orders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBAW {

	public static void main(String[] args) {

		ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\spring_beans_auto_wiring_constructor\\spring-beans.xml");
		
		
		Order order1=(Order)container.getBean("order1");
		System.out.println(order1);
		//System.out.println(order1.getOrderId());
		System.out.println(order1.getProduct());
		//System.out.println(order1.equals(order1.getProduct()));
		System.out.println(order1.getTransaction());
	}

}
