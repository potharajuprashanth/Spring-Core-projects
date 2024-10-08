package com.constructor.injection;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	
public Employee()
{
	System.out.println("Employee object is created for Setters:Default Constructor executed");
}
	
	public Employee(int id,String name,double salary)
	{
		super();
		System.out.println("Employee(id,name,salary) 3 params is executed...");
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	
	public Employee(int id,String name)
	{
		super();
		System.out.println("Employee(id,name)  2 parms is executed...");
		
		this.id=id;
		this.name=name;
		//default value for salary is set be 0.0
		//not only for salary for all the variables declared in the class means unspecified parameters in the constructor
	}
	
	
	
	
	
	
	
	

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	
}
