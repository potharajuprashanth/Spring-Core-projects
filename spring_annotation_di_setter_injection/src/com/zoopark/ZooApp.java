package com.zoopark;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container =new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();
	
		
		Zoo zoo=container.getBean(Zoo.class);
		System.out.println("Lion object /bean id in Zoo is :"+zoo.getLion());
	
	Lion lion=(Lion)container.getBean("lion");
	System.out.println("Lion object/bean id:            "+lion);
	

	Lion lion2=(Lion)container.getBean("lion2");
	System.out.println("Lion object2/bean id2:            "+lion2);
	
	
	}

}
