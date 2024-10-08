package com.zoopark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBeanConfiguration {
 
	//@Primary @Qualifier will have the higher priority than the @Primary
	
	@Bean("lion2")
	public Lion getLionTwo()
	{
		System.out.println("==Lion object2 is created======");
		return new Lion();
	}
}
