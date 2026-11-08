package com.premit.demo.privateconstructor;

public class DemoMain {
	public static void main(String[] args) {
		//Product product = new Product(); //Private constructor cannot be accessed outside the class
		
		Product product = Product.ob;
		product.getProductDetails();
	}
}
