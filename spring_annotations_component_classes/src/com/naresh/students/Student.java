package com.naresh.students;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	public Student()
	{
		System.out.println("Student is Instantiated...");
	}
	
}
