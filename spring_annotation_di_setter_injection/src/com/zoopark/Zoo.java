package com.zoopark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	
	
	
	
	Lion lion;
	
	
	public Zoo()
	{
		System.out.println("===Zoo is opened===");
	}
	 
	public Lion getLion() {
		return lion;
	}
   
	@Qualifier("lion")
	@Autowired
	public void setLion(Lion lion) {
		System.out.println("Lion injected into Zoo Via Setter method");
		this.lion = lion;
	}

	
	
	

	
	



}
