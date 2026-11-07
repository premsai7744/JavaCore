package com.premit.dynamicpolymorphism;

public class DemoMain {
	public static Product product;
	public static void main(String[] args) {
		if(Math.random()>10) {
			product = new Apple();
			product.getProductName();
		}else {
			product = new Samsung();
			product.getProductName();
		}
	}
}
