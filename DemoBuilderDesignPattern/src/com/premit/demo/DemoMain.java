package com.premit.demo;

public class DemoMain {
	public static void main(String[] args) {
		
		Product p1 = new Product.Builder()
				                .productId("A1111")
				                .productName("Iphone")
				                .build();
		
	    p1.display();
		
	}
}
