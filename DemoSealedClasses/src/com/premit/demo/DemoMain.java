package com.premit.demo;

public class DemoMain {
	public static void main(String[] args) {
		
		ClassA ob = new ClassA();
		System.out.println("==ClassA==");
		ob.methodA();
		
		ClassB ob2 = new ClassB();
		System.out.println("==ClassB==");
		ob2.methodA();
		ob2.methodB();
		
		ClassC ob3 = new ClassC();
		System.out.println("==ClassC==");
		ob3.methodA();
		ob3.methodC();
		
		ClassD ob4 = new ClassD();
		System.out.println("==ClassD==");
		ob4.methodA();
		ob4.methodD();
		
		ClassE ob5 = new ClassE();
		System.out.println("==ClassE==");
		ob5.methodA();
		ob5.methodD();
		ob5.methodE();
		
		
	
	}
}
