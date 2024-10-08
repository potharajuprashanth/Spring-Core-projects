module spring_annotation_di_fi_si_ci {
	
	exports com.flipkart.orders to spring.beans,spring.core,spring.context,spring.aop,spring.expression;
opens	com.flipkart.orders to spring.beans,spring.core,spring.context,spring.aop,spring.expression;
requires spring.beans;
requires spring.core;
requires spring.aop;
requires spring.expression;
requires spring.context;
}














































































}