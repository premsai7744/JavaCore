package com.premit.demo;

public class DemoMain {
	public static void add(int...args) {
		int sum = 0;
		for(int value : args) {
			sum = sum+value;
		}
	
		System.out.println("SUM : "+sum);
	
	}	
	
	public static void main(String[] args) {
		add(10,20,30);
		add(10,20);
		add();
		
		int[] a = {10,20,30};
		add(a);
 }
	
}
