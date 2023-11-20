package com.ryanmanchester.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class XMLConfigContextLauncher {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(XMLConfigContextLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
		}

	}

}
