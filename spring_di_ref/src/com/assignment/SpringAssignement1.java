package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAssignement1 {

	public static void main(String[] args) {
ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\spring_di_ref\\src\\assignment1-beans.xml");
Object obj=container.getBean("order1");

Order order=(Order)obj;

System.out.println(obj);

Product product11=order.getProduct();
System.out.println(product11);
	}

}
