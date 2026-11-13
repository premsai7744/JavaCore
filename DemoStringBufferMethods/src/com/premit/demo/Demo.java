package com.premit.demo;

public class Demo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("JavaProgramming"); 
		
		sb.insert(4, " Object-Oriented ");
		System.out.println(sb);
		
		sb.delete(4, 21);
		System.out.println(sb);
	
		sb.reverse();
		System.out.println(sb);
	}
}
