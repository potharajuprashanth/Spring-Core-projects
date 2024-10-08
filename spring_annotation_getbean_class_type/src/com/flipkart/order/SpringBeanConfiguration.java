package com.flipkart.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

	
	 @Bean
	 public Order getOrderTwo()
	 {
		 System.out.println("getOrderTwo() object is created");
		 return new Order();
	 }
}
