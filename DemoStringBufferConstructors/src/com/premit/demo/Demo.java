package com.premit.demo;

public class Demo {
	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer();//default capacity is 16
		System.out.println("==sb1==");
		System.out.println("capacity:"+sb1.capacity());
		System.out.println("sb1:"+sb1);
		
		
		sb1.append("Java");
		System.out.println("==After append(Java)==");
		System.out.println("capacity:"+sb1);
		System.out.println("sb1:"+sb1.capacity());
	
		sb1.append(" Programming session"); //dynamically capacity increases by doubling capacity and adding 2
		System.out.println("==After append( Programming session)==");
		System.out.println("capacity:"+sb1);
		System.out.println("sb1:"+sb1.capacity());
		
		
		StringBuffer sb2 = new StringBuffer(10);//default capacity is 10
		System.out.println("==sb2==");
		sb2.append("Java");
		System.out.println("capacity:"+sb2.capacity());
		System.out.println("sb2:"+sb2);
		
		sb2.append(" Programming session"); //dynamically capacity increases by doubling capacity and adding 2
		System.out.println("==After append( Programming sessions)==");
		System.out.println("capacity:"+sb2);
		System.out.println("sb2:"+sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("Java");//default capacity is 4(length of string)
		System.out.println("==sb3==");
		System.out.println("capacity:"+sb3.capacity());
		System.out.println("sb3:"+sb3);
		
		sb3.append(" Programming"); //dynamically capacity increases by doubling capacity and adding 2
		System.out.println("==After append( Programming sessions)==");
		System.out.println("capacity:"+sb3);
		System.out.println("sb3:"+sb3.capacity());
		System.out.println("length:"+sb3.length());
		
		
		StringBuffer sb4 = new StringBuffer(sb3);//16+16(length of string)
		System.out.println("==sb4==");
		System.out.println("capacity:"+sb4.capacity());
		System.out.println("sb4:"+sb4);
		
	}
}
