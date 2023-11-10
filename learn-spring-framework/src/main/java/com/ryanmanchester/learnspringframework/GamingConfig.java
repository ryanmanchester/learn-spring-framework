package com.ryanmanchester.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ryanmanchester.learnspringframework.game.GameInterface;
import com.ryanmanchester.learnspringframework.game.PacMan;

@Configuration
public class GamingConfig {
	
	@Bean
	public GameInterface game() {
		PacMan game = new PacMan();
		return game;
	}

}
