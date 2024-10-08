package com.prashanth.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigComponentDemo {


		public static void main(String[] args) {
			
			//1.while creating container ,passed config info
	ApplicationContext container =new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
	//2.after creating the container ,passed config info
	//AnnotationConfigApplicationContext container =new AnnotationConfigApplicationContext();
	//container.register(SpringBeanConfiguration.class); registering the confguration classes
	//container.refresh();  now process the cofiguration classes and create the objects
	
	
	//3. apporach
	
	//AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
	//container.scan("com.*"); must specify the @Configuration   no need to specify the @ComponentScan 
	//container.refresh();
	Object obj=container.getBean("order");

	Order order1=(Order)obj;
	
	System.out.println(order1);
	
	obj=container.getBean("order");//prototype means order1,order22 reference is different if it is singleton then  the references will be same
 Order order22=(Order)obj;
	System.out.println(order22);

	obj=container.getBean("product");

	Product product1=(Product)obj;
	
	System.out.println(product1);

	obj=container.getBean("student");

	com.naresh.students.Student student1=(com.naresh.students.Student)obj;//from different package
	
	System.out.println(student1);

	
	obj=container.getBean("getOrderOne");
	Order order2=(Order)obj;//order object through @Bean method 
		System.out.println(order2);

		
		
		obj=container.getBean("product1");//@Bean method with specifying the name of the bean id

		Product product11=(Product)obj;
		
		System.out.println(product11);
	}
}
