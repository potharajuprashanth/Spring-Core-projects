module Spring_ci_reference {
	exports com.flipkart.orders to spring.beans;
	exports com.constructor.ref to spring.beans;
	requires spring.beans;
	requires spring.context;
}