/**
 * 
 */
/**
 * 
 */
module spring_di_example {
	exports com.flipkart to spring.beans;
	exports com.flipkart.set.values;
	requires spring.beans;
	requires spring.context;
}