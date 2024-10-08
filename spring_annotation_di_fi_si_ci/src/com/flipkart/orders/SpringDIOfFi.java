package com.flipkart.orders;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDIOfFi {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
		
		container.scan("com.*");
		container.refresh();
		
	}

}
