package com.flipkart.set.values;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringStudentDIOFSetter {

	public static void main(String[] args) {
ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\spring_di_example\\spring-beans-set.xml");
Object obj=container.getBean("student");
Student std=(Student)obj;
System.out.println(std);

Set<String> subjects=std.getSubjects();

subjects.stream().forEach(System.out::println);

Map<String,Double> submarks=std.getSubMarks();
submarks.forEach((k,q)->{
	System.out.println(k+"\t"+q);
});
		
	}

}
