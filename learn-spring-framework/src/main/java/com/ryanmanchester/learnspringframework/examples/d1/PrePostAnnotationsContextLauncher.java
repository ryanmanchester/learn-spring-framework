package com.ryanmanchester.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency dep1;
	
	public SomeClass(SomeDependency dep1) {
		this.dep1 = dep1;
		System.out.println("Dependencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		dep1.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		dep1.destroy();
	}
	
}

@Component
class SomeDependency {
	public void getReady() {
		System.out.println("Data is ready");
	}
	
	public void destroy() {
		System.out.println("Cleanup");
	}
}


@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncher {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
		}

	}

}
