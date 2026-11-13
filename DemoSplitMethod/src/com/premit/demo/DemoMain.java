package com.premit.demo;

public class DemoMain {
	public static void main(String[] args) {
		String str = "Java,Python,C++,C";
		
		String[] result = str.split(",");
		for(String r : result) {
			System.out.println(r);
		}
		
		String str2 = "Java,Python C";
		String[] result2 = str2.split("[,; ]");
		for(String r2 : result2) {
			System.out.println(r2);
		}
		
	}
}
