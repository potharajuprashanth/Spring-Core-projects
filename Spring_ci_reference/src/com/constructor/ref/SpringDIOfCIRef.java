package com.constructor.ref;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDIOfCIRef {

	public static void main(String[] args) {
ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\Spring_ci_reference\\ref-beans.xml");

Object obj=container.getBean("order1");

OrderDetails order=(OrderDetails)obj;
System.out.println(order);

List<ProductDetails> product=order.getProductDetails();

product.stream().forEach(System.out::println);

obj=container.getBean("order2");
OrderDetails order1=(OrderDetails)obj;
System.out.println(order1);

List<ProductDetails> product1=order1.getProductDetails();

product1.stream().forEach(System.out::println);




	}

}
