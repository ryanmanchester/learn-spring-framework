package com.ryanmanchester.learnspringframework.calculationservice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan
public class BusinessCalculationLauncher {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BusinessCalculationLauncher.class)) {
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}

	}

}
