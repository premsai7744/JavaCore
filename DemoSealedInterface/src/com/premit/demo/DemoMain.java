package com.premit.demo;

public class DemoMain {
	public static void main(String[] args) {
		InterfaceA ob1 = new ClassA();
		ob1.methodA();
		
		InterfaceA ob2 = new ClassB();
		ob2.methodA();
		
		InterfaceA ob3 = new ClassC();
		ob3.methodA();
	
		InterfaceA ob4 = new ClassD();
		ob4.methodA();
		
	}
}
