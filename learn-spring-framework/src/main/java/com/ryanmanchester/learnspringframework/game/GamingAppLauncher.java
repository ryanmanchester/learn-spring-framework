package com.ryanmanchester.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ryanmanchester.learnspringframework.game")
public class GamingAppLauncher {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
			context.getBean(GameRunner.class).run();
		}

	}

}
