package com.ryanmanchester.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass {
	Dep1 dep1;
	Dep2 dep2;
	
	@Autowired
	public BusinessClass(Dep1 dep1, Dep2 dep2) {
		System.out.println("Constructor injection");
		this.dep1 = dep1;
		this.dep2 = dep2;
	}
//	@Autowired
//	public void setDep1(Dep1 dep1) {
//		System.out.println("Setter injection - setDep1");
//		this.dep1 = dep1;
//	}
//	
//	@Autowired
//	public void setDep2(Dep2 dep2) {
//		System.out.println("Setter injection - setDep2");
//		this.dep2 = dep2;
//	}
	
	public String toString() {
		return "Using: " +dep1 + " and " +dep2;
	}
	
}

@Component
class Dep1 {
	
}

@Component
class Dep2 {
	
}
@Configuration
@ComponentScan
public class DepInjectionAppLauncher {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DepInjectionAppLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessClass.class));
			
		}

	}

}
