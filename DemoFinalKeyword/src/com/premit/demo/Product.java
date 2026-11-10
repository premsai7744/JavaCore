package com.premit.demo;

//final class cannot be extended, means inheritance is not possible
public final class Product {
	
	//final variables: final static variables, final instance variables, final local variables
	private final String productName;
	
	//final variables can be initialized using constructors
	public Product(String productNName) {
		this.productName = productNName;
	}
	
	//final method overloading is possible, but method overriding is not possible.
	public final void m1(int a) {
		System.out.println("==m1()==");
		System.out.println("a:"+a);
	}
	public final void m1(int a,int b) {
		System.out.println("==m2()==");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public final void m1(int a,int b,int c) {
		System.out.println("==m3()==");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
	
}
