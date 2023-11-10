package com.ryanmanchester.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ryanmanchester.learnspringframework.game.GameInterface;
import com.ryanmanchester.learnspringframework.game.GameRunner;
import com.ryanmanchester.learnspringframework.game.PacMan;

@Configuration
public class GamingConfig {
	
	@Bean
	public GameInterface game() {
		PacMan game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner runner(GameInterface game) {
		GameRunner runner = new GameRunner(game);
		return runner;
	}

}
