package com.ryanmanchester.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ryanmanchester.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan("com.ryanmanchester.learnspringframework.game")
public class App03GamingSpringBeans {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
			context.getBean(GameRunner.class).run();
		}

	}

}
