package com.premit.demo;

import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in);Scanner s2 = new Scanner(System.in)){
			System.out.println("Enter product name:");
			String productName = s.nextLine();
			System.out.println("Enter product price:");
			float productPrice = s2.nextFloat();
		
			System.out.println("****PRODUCT-DETAILS****");
			System.out.println("PRODUCTNAME:"+productName);
			System.out.println("PRODUCTPRICE:"+productPrice);
		}
	}
}
