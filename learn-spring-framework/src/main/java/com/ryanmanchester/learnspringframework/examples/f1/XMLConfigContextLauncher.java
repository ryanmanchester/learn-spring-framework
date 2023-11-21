package com.ryanmanchester.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ryanmanchester.learnspringframework.game.GameRunner;


public class XMLConfigContextLauncher {
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			System.out.println(context.getBean("name"));
			context.getBean(GameRunner.class).run();
		}

	}

}
