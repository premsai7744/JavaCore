package com.premit.demo;

public class Display {
	
	@MyAnnotation
	public void m1() {
		System.out.println("==m1==");
	}
	
	public void m2() {
		System.out.println("==m2==");
	}
	
	@MyAnnotation
	public void m3() {
		System.out.println("==m3==");
	}
}
