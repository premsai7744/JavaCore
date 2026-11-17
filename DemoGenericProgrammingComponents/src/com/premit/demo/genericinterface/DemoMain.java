package com.premit.demo.genericinterface;
public class DemoMain {
	public static void main(String[] args) {
		Product p = new Product();
		p.set("Java");
		String result = p.get();
		System.out.println("Result : "+result);
	}
}
