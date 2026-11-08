package com.premit.demo.privateconstructor;

public class Product {
	
	public String productName="Iphone";
	public float productPrice=100000.00f;
	public static Product ob = new Product();//constructor call
	
	private Product() {
		System.out.println("private constructor");
	}
	
	public void getProductDetails() {
		System.out.println("ProductName:"+productName);
		System.out.println("ProductPrice:"+productPrice);
	}
	
	
	
}
