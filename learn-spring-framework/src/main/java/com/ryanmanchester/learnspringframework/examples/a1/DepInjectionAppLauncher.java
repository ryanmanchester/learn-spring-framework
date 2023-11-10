package com.ryanmanchester.learnspringframework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ryanmanchester.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan("com.ryanmanchester.learnspringframework.game")
public class DepInjectionAppLauncher {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DepInjectionAppLauncher.class)) {
			context.getBean(GameRunner.class).run();
		}

	}

}
