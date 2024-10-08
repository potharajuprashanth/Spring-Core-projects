package com.zoopark;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("lion")
public class Lion {

	
	public Lion()
	{
		System.out.println("=====NEW LION IS ADDED===");
	}
	
	}


