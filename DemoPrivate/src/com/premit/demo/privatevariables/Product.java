package com.premit.demo.privatevariables;

public class Product {
	private int productId=101;
	private String productName="Iphone";
	private static int productQty=1;
	private static boolean isProductAvailable=true;
	
	//private variables can be accessed only inside the class
	public void getProductInfo() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(productQty);
		System.out.println(isProductAvailable);
	}
	
}
