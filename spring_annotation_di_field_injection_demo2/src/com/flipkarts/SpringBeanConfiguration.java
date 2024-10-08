package com.flipkarts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {
 
	@Bean("product2")
	public Product getProductTwo()
	{
		System.out.println("getProductTwo() Product Object 2 is instantiated.....");
		return new Product();
	}
}
