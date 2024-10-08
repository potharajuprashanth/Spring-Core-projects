package com.zoopark;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class Lion implements Animal{

	
	public Lion()
	{
		System.out.println("=====NEW LION IS ADDED===");
	}
	@Override
	public void getNameOfAnimal() {
		System.out.println("This is Animal Lion");
	}

	@Override
	public int getCountOfAniamals(String animalName) {
		System.out.println("15 Lions are Available");
		int countOfLions=15;
	return countOfLions;
	}

}
