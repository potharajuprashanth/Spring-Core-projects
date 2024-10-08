module spring_beans_auto_wiring {
	exports com.spring.bean.scope to spring.beans;
	requires spring.beans;
	requires spring.context;
}