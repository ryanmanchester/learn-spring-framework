package com.ryanmanchester.learnspringframework;

import com.ryanmanchester.learnspringframework.game.GameRunner;
import com.ryanmanchester.learnspringframework.game.MarioBros;
import com.ryanmanchester.learnspringframework.game.PacMan;
import com.ryanmanchester.learnspringframework.game.SuperContra;

public class AppGamingBasic {

	public static void main(String[] args) {
		MarioBros marioBros = new MarioBros();
		SuperContra superContra = new SuperContra();
		PacMan pacMan = new PacMan();
		GameRunner gameRunner = new GameRunner(pacMan);
		
		gameRunner.run();

	}

}
