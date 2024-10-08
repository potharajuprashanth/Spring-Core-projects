package com.flipkarts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDIOFFi {

	public static void main(String[] args) {
  
		AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();
		
		
	}

}
