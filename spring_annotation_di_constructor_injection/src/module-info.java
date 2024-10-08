module spring_annotation_di_field_injection_demo2 {
	   exports com.zoopark;
	   opens com.zoopark to spring.beans, spring.core, spring.context, spring.aop, spring.expression;

	    requires spring.beans;
	    requires spring.core;
	    requires spring.aop;
	    requires spring.expression;
	    requires spring.context;
}