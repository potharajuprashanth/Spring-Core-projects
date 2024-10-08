package com.flipkarts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



@Configuration
public class SpringBeanConfiguration {
 
	//@Primary //to make it as the default when we are not specifying the @Qualifer 
	@Bean("product1")
	public Product getProductTwo()
	{
		System.out.println("getProductOne() Product Object no.2 is instantiated.....");
		return new Product();
	}
}
