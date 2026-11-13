package com.premit.demo;

import java.util.StringTokenizer;

public class DemoTokenizer {
	public static void main(String[] args) {
		String str = "Java,Python,C++,C";
		
		StringTokenizer ob = new StringTokenizer(str,",");
		StringTokenizer ob2 = new StringTokenizer(str,",");
		
		System.out.println("count of tokens in ob : "+ob.countTokens());
		System.out.println("count of tokens in ob2 : "+ob2.countTokens());
		
		
		while(ob.hasMoreTokens()) {
			String token = ob.nextToken();
			System.out.println(token);
		}
		while(ob2.hasMoreElements()) {
			String token =(String)ob2.nextElement();
			System.out.println(token);
		}
		System.out.println("count of tokens in ob : "+ob.countTokens());
		System.out.println("count of tokens in ob2 : "+ob2.countTokens());
		
	}
}
