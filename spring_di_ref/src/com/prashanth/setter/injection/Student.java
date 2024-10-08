package com.prashanth.setter.injection;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private List<Long> mobileNumbers;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Long> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<Long> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public Student()
	{
		System.out.println("Student object is created with default constructor...");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileNumbers=" + mobileNumbers + "]";
	}
	
}
