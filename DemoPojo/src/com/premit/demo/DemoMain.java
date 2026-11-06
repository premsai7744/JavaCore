package com.premit.demo;

public class DemoMain {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId("A102");
		p1.setName("Iphone");
		p1.setPrice(20000.00f);
		p1.setQty(2);
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getQty());
		
	}

}
