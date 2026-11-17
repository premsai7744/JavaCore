package com.premit.demo;
import java.util.ArrayList;
public class DemoMain {
	public static void main(String[] args) {
		
		//Without Generics
		ArrayList al = new ArrayList();
		al.add("101");
		al.add("102");
		al.add(103);
		
		
		String str1 = (String)al.get(0);
		String str2 = (String)al.get(1);
		String str3 = (String)al.get(2);//At runtime you'll get error bcz you are converting Integer to String : NO TYPE SAFETY
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		
		//With Generics
		ArrayList<String> al2 = new ArrayList();
		al2.add("101");
		al2.add("102");
		//al2.add(103);//At compile time only showing error you cannot add Integer value, you should add only String value.: TYPE SAFETY

		
		
		String str11 = (String)al.get(0);
		String str22 = (String)al.get(1);
		String str33 = (String)al.get(2);
		
		System.out.println("str1:"+str11);
		System.out.println("str2:"+str22);
		System.out.println("str3:"+str33);
		
	}
}
