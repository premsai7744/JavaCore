package com.premit.demo.genericmethod;

public class DemoMain {
	public static void main(String[] args) {
		Display d = new Display();
		//generic method without return type.
		d.display(100);
		d.display("Java");
		d.display(10.00d);
		
		//generic method with return type.
		Integer integerValue = d.getValue(100);
		String stringvalue = d.getValue("Java");
		Double doubleValue = d.getValue(100.00d);
		
		System.out.println("integerValue : "+integerValue);
		System.out.println("stringvalue : "+stringvalue);
		System.out.println("doubleValue : "+doubleValue);
		
		//generic method with multiple params.
		d.show(101, "Ram");
	}
}
