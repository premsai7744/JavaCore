package com.premit.demo.genericwildcards;
import java.util.ArrayList;
import java.util.List;

public class DemoMain {
	//Without wild card
	public static void display(List<Integer> list) {
		System.out.println("==display==");
		System.out.println(list);
	}
	
	//With Wild card <?> : Accepts unknown datatypes. 
	public static void display2(List<?> list) {
		System.out.println("==display2==");
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ram");
		al2.add("Raj");
		
		
		display(al);
		//display(al2);//This method doesn't accept List<String> as method parameter.
		
		display2(al);
		display2(al2);
		
		
	}
}
