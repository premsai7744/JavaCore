package com.premit.demo4;

public enum Courses {
	JAVA(3000),ORACLE(4000),SPRING(5000);
	
	private int price;
	
	private Courses(int price) {
		this.price = price;
	}
	
	static {
		System.out.println("==static-block==");
	}
	
	{
		System.out.println("==Instance-block==");
	}
	
	public int getPrice() {
		return price;
	}
}
