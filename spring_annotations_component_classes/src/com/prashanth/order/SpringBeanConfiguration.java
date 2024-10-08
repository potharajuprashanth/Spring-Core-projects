package com.prashanth.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@ComponentScan("com.prashanth.order") for one package
//only package name specify
//container will come here and scan all the component classes in the com.prashanth.order packege
@ComponentScan({"com.prashanth.order","com.naresh.students"})
@Configuration
public class SpringBeanConfiguration {

	@Scope("prototype")
	@Bean
	public Order getOrderOne()
	{
		System.out.println("getOrderOne() is created");
		return new Order();
	}
	
	@Bean("product1")
	public Product getProductOne()
	{
		return new Product();
	}
}
