package com.prashanth.setter.injection;

public class College {

	private  String clgName;
	private Student std;

	public College()
	{
		System.out.println("College object is created");
	}
	
	
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		System.out.println("Student object is created in the College also");
		this.std = std;
	}


	@Override
	public String toString() {
		return "College [clgName=" + clgName + ", std=" + std + "]";
	}
	
	
}
