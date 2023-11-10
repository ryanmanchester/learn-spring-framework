package com.ryanmanchester.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryanmanchester.learnspringframework.game.GameInterface;


public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
			context.getBean(GameInterface.class).up();
		}

	}

}
