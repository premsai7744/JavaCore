package com.premit.demo;


public class DemoMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String name = null;	
		//String name = "Ram";
		if(name!=null) {
			System.out.println(name.length());
			System.out.println(name.toUpperCase());	
		} else {
			System.out.println("Name is null!");
		}
	}

}
