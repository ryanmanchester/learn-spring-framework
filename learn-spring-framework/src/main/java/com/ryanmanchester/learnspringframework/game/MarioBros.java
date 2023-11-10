package com.ryanmanchester.learnspringframework.game;

public class MarioBros implements GameInterface {
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Duck");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Go forward");
	}



}
