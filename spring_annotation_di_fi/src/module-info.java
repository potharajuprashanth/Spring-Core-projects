module spring_annotation_di_fi {
    
    exports com.flipkart.orders;
    exports com.flipkarts;
    
    opens com.flipkart.orders to spring.beans, spring.core, spring.context, spring.aop, spring.expression;
    opens com.flipkarts to spring.beans, spring.core, spring.context, spring.aop, spring.expression;

    requires spring.beans;
    requires spring.core;
    requires spring.aop;
    requires spring.expression;
    requires spring.context;
}
