module spring_beans_auto_wiring {
	exports com.flipkart.orders to spring.beans;
	requires spring.beans;
	requires spring.context;
}