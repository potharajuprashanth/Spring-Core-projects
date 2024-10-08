package com.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBS {

	public static void main(String[] args) {

		
		ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\prashanth.potharaju\\spring-core-workspace\\spring_beans_scopes\\spring-beans.xml");
		
		//first time request to  container e1   singleton scope
		Object obj=container.getBean("e1");
		
		System.out.println("=======e1 singleton scope========");
		Employee emp1=(Employee)obj;
		System.out.println(emp1);
		emp1.setName("Virat Kohli");
		//2nd time request to  container e1  singleton scope
 obj=container.getBean("e1");
		
 
 
		Employee emp2=(Employee)obj;
		System.out.println(emp2);
		System.out.println(emp2.getName());//Virat Kohli name reflected from emp1 to emp2 for the same e1 object
		
		
		

		 System.out.println("======e2 prototype scope========");
		//1st time request to  container e2   prototype scope
				 obj=container.getBean("e2");
				
				Employee emp3=(Employee)obj;
				System.out.println(emp3);
				emp3.setName("Virat Kohli");
				//2nd time request to  container e2  prototype scope
		 obj=container.getBean("e2");
				
				Employee emp4=(Employee)obj;
				System.out.println(emp4);
				System.out.println(emp4.getName());//null will print Virat Kohli name not reflected from emp1 to emp2 for the same e2 object because e2 created newly
				/* Output
				 * ======e2 prototype scope======== 
				 * Employee default constructor executed an object is created.... 
				 * com.spring.bean.scope.Employee@37858383
				 *  Employee default constructor executed and object is created....
				 * com.spring.bean.scope.Employee@4e268090 null
				 */
		
	}

}
