package com.ryanmanchester.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContra implements GameInterface {

	@Override
	public void up() {
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		System.out.println("Duck");
		
	}

	@Override
	public void left() {
		System.out.println("Throw knife");
		
	}

	@Override
	public void right() {
		System.out.println("Shoot gun");
		
	}
	
	
}
