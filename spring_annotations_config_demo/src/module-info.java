module spring_annotations_config_demo {
    exports com.spring.annotations to spring.beans, spring.aop, spring.context; // Export to spring.context
    opens com.spring.annotations to spring.core, spring.context; // Allow reflective access to both spring.core and spring.context
    
    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.aop;
    requires spring.expression;
    requires spring.jcl;
}
