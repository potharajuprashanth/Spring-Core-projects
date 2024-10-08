package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {

    public static void main(String[] args) {
     BeanFactory factory=new org.springframework.context.support.FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\SpringCoreModule\\beans.xml");
    Object obj=factory.getBean("s1");
    Student student=(Student)obj;
    student.printStudentInfo();
    System.out.println();
    obj=factory.getBean("e");
    Employee employee=(Employee)obj;
    employee.printEmployeeInfo();
    
    
    }
}
