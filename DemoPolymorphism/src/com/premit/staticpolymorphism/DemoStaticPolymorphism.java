package com.premit.staticpolymorphism;
public class DemoStaticPolymorphism {
	
	public void add(int a) {
		System.out.println("a:"+a);
		System.out.println("Result:"+a);
	}
	public void add(int a,int b) {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		int result = a+b;
		System.out.println("int Result:"+result);
	}
	
	public void add(float a,float b) {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		float result = a+b;
		System.out.println("float Result:"+result);
	}
	public void add(int a,int b,int c) {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		int result = a+b+c;
		System.out.println("Result:"+result);
	}
	
}
