package com.premit.demo.privatemethods;

public class Product {
	private static void m1() {
		System.out.println("==m1==");
	}
	private void m2() {
		System.out.println("==m2==");
	}
	
	public void access() {
		Product.m1();
		m2();
	}
	
	//Private methods overloading
	private void display(int a) {
		System.out.println("==display(a)===");
		System.out.println("a:"+a);
	}
	private void display(int a,int b) {
		System.out.println("==display(a,b)==");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	private void display(int a,int b,int c) {
		System.out.println("==display(a,b,c)==");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
	
	public void accessDisplay() {
		display(10,20);
	}
	
	//private method overriding : Not possible because private methods not available to child class.
	private void printMessage() {
		System.out.println("PClass");
	}
}
