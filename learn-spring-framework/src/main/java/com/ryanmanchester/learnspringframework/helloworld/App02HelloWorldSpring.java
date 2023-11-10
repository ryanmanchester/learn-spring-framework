package com.ryanmanchester.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//try with resources
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("personMethodCall"));
			System.out.println(context.getBean("personParameters"));
			System.out.println(context.getBean(Address.class));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		
	}

}
