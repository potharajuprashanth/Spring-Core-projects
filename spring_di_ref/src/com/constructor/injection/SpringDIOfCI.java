package com.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDIOfCI {

	public static void main(String[] args) {
ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\spring_di_ref\\src\\constructor-beans.xml");
	
	Object obj=container.getBean("employee1");
	Employee employee1=(Employee)obj;
	System.out.println(employee1);
	
	
	obj=container.getBean("employee11");
	Employee employee11=(Employee)obj;
	System.out.println(employee11);
	
	
	
	obj=container.getBean("employee111");
	Employee employee111=(Employee)obj;
	System.out.println(employee111);
	
	obj=container.getBean("employee2");
	Employee e2=(Employee)obj;
	System.out.println(e2);
	
	obj=container.getBean("employee4");
	Employee e4=(Employee)obj;
	System.out.println(e4);
	}

}
