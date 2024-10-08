package com.prashanth.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDIOfSetter {

	public static void main(String[] args) {
ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\spring_di_ref\\src\\spring-beans.xml");
Object obj=container.getBean("college");

College clg=(College)obj;
System.out.println(clg);

Student stdt=clg.getStd();
System.out.println(stdt);

 obj=container.getBean("college1");

College clg1=(College)obj;
System.out.println(clg1);

Student stdt2=clg1.getStd();
System.out.println(stdt2);



	}

}
