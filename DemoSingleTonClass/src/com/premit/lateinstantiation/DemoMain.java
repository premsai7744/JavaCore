package com.premit.lateinstantiation;

public class DemoMain {
	public static void main(String[] args) {
		// Test ob = new Test(); //Restricting object creation outside the class
		Test ob1 = Test.getRef();
		Test ob2 = Test.getRef();
		Test ob3 = Test.getRef();
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}
}
