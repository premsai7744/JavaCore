package com.premit.demo;

public class DemoStringConcatenation {
	public static void main(String[] args) {
		//String concatenation
		
		String str1 = "Java";
		String str2 = "Programming";
		
		//1.using + operator
		System.out.println("==using + operator==");
		String str3 = str1+str2;
		System.out.println(str3);
		
		//2.using concat() method
		System.out.println("==using concat() method==");
		String str4 = str1.concat(str3);
		
		//3.using StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		System.out.println("==using StringBuffer==");
		System.out.println(sb);
		
		//4.using StringBuilder
		StringBuilder sb2 = new StringBuilder();
		sb2.append(str1);
		sb2.append(str2);
		System.out.println("==using StringBuilder==");
		System.out.println(sb2);
		
		//5.using join() 
	    String str5 = String.join("-",str1,str2);
	    System.out.println("==using join()==");
	    System.out.println(str5);
		
	}
	
}
