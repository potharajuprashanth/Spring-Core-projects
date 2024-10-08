package com.spring.annotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// then the class is called as configuration class
public class BeanConfiguration {

	@Bean("product1")//is equals to <bean id="product1"></bean>
	public Product getProduct()
	{
		System.out.println("getProduct() executedddddd");
		Product product=new Product();
		
		return product;
	}
	/*    not create the object agaiin and again
	 * @Bean("product1") public Product getProductTwo() {
	 * System.out.println("getProductOne() executreddd"); Product product=new
	 * Product(); return product; }
	 */
	
	@Bean("product2")
	public Product getProductOne()
	{
		System.out.println("getProductOne() executreddd");
		Product product=new Product();
		return product;
	}
	
	
	/* not executed because container starts execution from @Bean methods
	 * public Product getProductThree() {
	 * System.out.println("getProductThree() executreddd"); Product product=new
	 * Product(); return product; }
	 */
	
	@Bean("order1")
	public Order getOrderOne()
	{
		Order order=new Order();
		return order;
	}
	
}
