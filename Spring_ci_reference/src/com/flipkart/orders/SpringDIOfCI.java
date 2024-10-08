package com.flipkart.orders;

import java.util.Collection;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDIOfCI {

	public static void main(String[] args) {
ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\Spring_ci_reference\\spring-beans.xml");
	Object obj=container.getBean("o1");
	Order o1=(Order)obj;
	System.out.println(o1);
	System.out.println(o1.getFoodItemNames());
	
	 obj=container.getBean("o2");
	Order o2=(Order)obj;
	System.out.println(o2);
	System.out.println(o2.getFoodItemNames());
	
	 obj=container.getBean("o3");
		Order o3=(Order)obj;
		System.out.println(o3);
		
	Order menu=(Order)container.getBean("menu");
	System.out.println(menu.getPrices());
	System.out.println(menu.getFoodItemNames());
	
	Map<String,Double> menuu=menu.getPrices();
menuu.forEach((items,prices)->
{
	System.out.println(items+"\t"+prices);
});
	
	}

}
