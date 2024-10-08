package com.zoopark;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.aot.ApplicationContextAotGenerator;

public class ZooApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container =new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();
		
		/*
		 * Lion lion=container.getBean(Lion.class); 
		 * Zoo zoo=container.getBean(Zoo.class); 
		 * System.out.println(lion);
		 * System.out.println(zoo);
		 *  System.out.println(zoo.getLion());
		 */
		
		Zoo zoo=container.getBean(Zoo.class);
		System.out.println("zoo object/bean id:"+zoo);
		System.out.println("Lion of Animal interface object/bean id in zoo :"+zoo.getAnimal());
	Animal animal=	zoo.getAnimal();
	animal.getNameOfAnimal();
	System.out.println(animal.getCountOfAniamals("Lions"));
	
	
	/*we can use like this also  we get same
	 * Animal animalLion1=(Lion)container.getBean("lion");
	 *  Lion animalLion2=(Lion)container.getBean("lion"); 
	 *  System.out.println(animalLion1);
	 * System.out.println(animalLion2);
	 */
		Zoo zoo1=container.getBean(Zoo.class);
		Animal animalLion=zoo1.getAnimal();
	    System.out.println(animalLion);
		animalLion.getNameOfAnimal();
		System.out.println(animalLion.getCountOfAniamals("Lions"));
		
		Animal animalLion2=(Animal)container.getBean("lion2");
	    System.out.println(animalLion2);
		animalLion2.getNameOfAnimal();
		System.out.println(animalLion2.getCountOfAniamals("Lions"));
		
		
	}

}
