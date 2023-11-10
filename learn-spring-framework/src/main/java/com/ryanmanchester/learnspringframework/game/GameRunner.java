package com.ryanmanchester.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GameInterface game;
	
	public GameRunner(GameInterface game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " +game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
