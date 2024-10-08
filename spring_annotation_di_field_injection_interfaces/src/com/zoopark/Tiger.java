package com.zoopark;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal{

	
	 public Tiger()
	 {
		 System.out.println("==New Tiger Is Addeed====");
	 }
	@Override
	public void getNameOfAnimal() {
      System.out.println("This is  Tiger");		
	}

	@Override
	public int getCountOfAniamals(String animalName) {

		int count=65;
		System.out.println(count+" Tigers are Avaible");
		return count;
	}
   
	
	
	
}
