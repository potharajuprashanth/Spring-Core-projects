package com.flipkart.set.values;

import java.util.Map;
import java.util.Set;



public class Student {

	private int id;
	private String name;
	private Set<String> subjects;
	
	private Map<String,Double> subMarks;
public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
public Student(int id)
{
	System.out.println("Student is created....");
}
public Student()
{
	System.out.println("Student is created with default Constructor....");//object is created for the default constructor must declare
}
	
	public Map<String, Double> getSubMarks() {
	return subMarks;
}
public void setSubMarks(Map<String, Double> subMarks) {
	this.subMarks = subMarks;
}
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", subMarks=" + subMarks + "]";
	}


	
}

