module spring_annotations_component_classes {
	exports com.prashanth.order to spring.beans,spring.context,spring.core,spring.aop;
	opens com.prashanth.order to spring.aop,spring.core,spring.beans,spring.context;
	exports com.naresh.students to spring.beans,spring.context,spring.core,spring.aop;
	opens com.naresh.students to spring.aop,spring.core,spring.beans,spring.context;
	requires spring.beans;
	requires spring.core;
	requires spring.aop;
	requires spring.context;

	
}