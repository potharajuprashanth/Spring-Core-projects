package com.zoopark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	public Zoo()
	{
		System.out.println("===Zoo is opened===");
	}
	 
	
	//@Qualifier("tiger")// If Animal have Tiger Implementation class also then  Tiger is injected into Zoo
	//Inject an object of Implementation class of Animal Interface Animal animal=new Lion(); if Animal have only one Implementation class
	@Autowired
     private Animal animal; 
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Animal getAnimal()
	{
		return animal;
	}
	//instead of  below use above
	/*
	 * @Autowired private Lion lion; 
	 * public Lion getLion() 
	 * { return lion;
	 *  }
	 */
	
	



}
