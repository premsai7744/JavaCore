package com.premit.demo;

import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		try(s1;s2){
			System.out.println("Enter product name:");
			String productName=s1.nextLine();
			System.out.println("Enter product color:");
			String  productColor = s2.nextLine();
			
			System.out.println("====ProductDetails====");
			System.out.println("ProductName:"+productName);
			System.out.println("ProductColor:"+productColor);
		}
	}
}
