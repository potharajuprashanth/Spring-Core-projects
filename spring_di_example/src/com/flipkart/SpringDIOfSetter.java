package com.flipkart;

import java.util.List;
import java.util.Spliterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.flipkart.set.values.Student;

public class SpringDIOfSetter {

	public static void main(String[] args) {

		ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\spring_di_example\\spring-beans.xml");
		Object obj=container.getBean("product1");
		Product pd=(Product)obj;
		//pd.setId(201);
		System.out.println("productId:"+pd.getId());//201 using pd.setId(201);
		System.out.println("Pname"+pd.getProductName());
		System.out.println("Pprice"+pd.getPrice());
		
		
		 obj=container.getBean("product2");
		Product pd1=(Product)obj;
		//pd1.setId(202);injcted 
		System.out.println("productId:"+pd1.getId());//202 using pd1.setId(202);
		System.out.println("Pname"+pd1.getProductName());
		System.out.println("Pprice"+pd1.getPrice());
		//pd1.setId(202);not injected right now
		
		
		
		obj=container.getBean("order1");
		Order order1=(Order)obj;
		
		System.out.println(order1);
		
		List<String> items=order1.getFoodItemNames();
		System.out.println("====Food Items Names=====");
		for(String names:items)
		{
			System.out.println(names.toString());
		}
		
		System.out.println("====Prices=====");
		
		List<Double> prices=order1.getPrices();
		
		prices.stream().forEach(System.out::println);//Stream API
		Spliterator<Double> sp=prices.spliterator();
		sp.forEachRemaining(k->{
			System.out.println(k);
			
		});
	//	ListIterator<Double> sp=prices.listIterator();
		//while(sp.hasNext())
		//{
			//System.out.println(sp.next());
		//}
	//	for(Double pricess:prices)
		//{
			//System.out.println(pricess);
		//}
		
		obj=container.getBean("student");
		Student std=(Student)obj;
		
		
		
	}

}
