/**
 * 
 */
/**
 * 
 */
module spring_di_ref {
	exports com.prashanth.setter.injection to spring.beans;
	exports com.assignment to spring.beans;
	exports com.constructor.injection to spring.beans;
	requires spring.beans;
	requires spring.context;
}