package com.premit.DemoBuilderDesignPatternLombok;

public class DemoMain {
	public static void main(String[] args) {
		Product p1 = new Product.ProductBuilder()
				                .productId("A18")
				                .productName("apple18promax")
				                .build();
		System.out.println(p1.toString());
	}
}
