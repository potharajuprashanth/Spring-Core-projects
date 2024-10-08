package com.naresh;

public class Employee {
int eid;
String ename;
float sal;
public Employee()
{
	System.out.println("Employee is Created.....");
	
}
public void printEmployeeInfo()
{
	System.out.println("Empid is :"+eid);
	System.out.println("Ename is:"+ename);
	System.out.println("Esal is :"+sal);
}
}
