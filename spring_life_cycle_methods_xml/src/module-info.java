module spring_life_cycle_methods_xml {
	
	exports com.prashanth.orders to spring.context,spring.core,spring.beans,spring.aop;
	opens com.prashanth.orders to spring.context,spring.core,spring.beans,spring.aop;
	requires spring.beans;
	requires spring.aop;
	requires spring.context;
	requires spring.core;
	
	
}