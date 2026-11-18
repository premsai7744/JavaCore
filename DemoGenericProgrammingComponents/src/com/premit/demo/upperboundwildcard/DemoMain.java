package com.premit.demo.upperboundwildcard;
import java.util.ArrayList;
import java.util.List;

public class DemoMain {
	
	public static void display(List<Number> list) {
		System.out.println(list);
	}
	
	public static void display2(List<? extends Number> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		
		List<Float> list2 = new ArrayList<Float>();
		list2.add(10.0f);
		list2.add(20.0f);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("Ram");
		list3.add("Raj");
		
	//	display(list1); //compile-time error, List<Integer> is not a subclass of List<Number>
	//	display(list2); //compile-time error, List<Integer> is not a subclass of List<Float>
	//	display(list3); //compile-time error, List<Integer> is not a subclass of List<String>
		
		display2(list1);
		display2(list2);
	//	display2(list3);
		
		
	}
}
