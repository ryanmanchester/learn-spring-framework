package com.ryanmanchester.learnspringframework.examples.b1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Initialization Logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do something here");
	}
}


@Configuration
@ComponentScan
public class LazyInitializationLauncherApp {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApp.class)) {
			System.out.println("Initialization of context is complete");
			context.getBean(ClassB.class).doSomething();
		}

	}

}
