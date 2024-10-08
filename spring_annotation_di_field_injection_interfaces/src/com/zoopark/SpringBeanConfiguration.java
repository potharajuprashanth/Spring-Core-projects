package com.zoopark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBeanConfiguration {

	@Primary
	 @Bean("lion2")
	 public Lion getLionTwo()
	 {
		 System.out.println("==========Lion Object2 is created========= ");
		 return new Lion();
	 }
	
}
