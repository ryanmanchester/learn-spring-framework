package com.ryanmanchester.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ryanmanchester.learnspringframework.game.GameInterface;
import com.ryanmanchester.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan("com.ryanmanchester.learnspringframework.game")
public class App03GamingSpringBeans {
	
	@Bean
	public GameRunner runner(GameInterface game) {
		GameRunner runner = new GameRunner(game);
		return runner;
	}
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
			context.getBean(GameInterface.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
