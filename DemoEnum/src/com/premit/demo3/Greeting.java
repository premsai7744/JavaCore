package com.premit.demo3;

public enum Greeting implements Message{
	HI,HELLO;
	
	@Override
	public void display() {
		System.out.println("Welcome to Java.");		
	}
}
