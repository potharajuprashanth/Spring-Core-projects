package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpingDemo11 {
public static void main(String[] args) {
	ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\SpringCoreModule\\beans.xml");


	 BeanFactory factory=new org.springframework.context.support.FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\SpringCoreModule\\beans.xml");}
}
