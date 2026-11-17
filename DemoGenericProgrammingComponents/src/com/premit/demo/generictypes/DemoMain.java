package com.premit.demo.generictypes;

public class DemoMain {
	public static void main(String[] args) {
		Display<String> display1 = new Display<>();
		display1.setValue("Java");
		String value1 = display1.getValue();
		System.out.println("value1:"+value1);
		
		Display<Integer> display2 = new Display<>();
		display2.setValue(100);
		Integer value2 = display2.getValue();
		System.out.println("value2:"+value2);
	
		Display<Double> display3 = new Display<>();
		display3.setValue(100.00);
		Double value3 = display3.getValue();
		System.out.println("value3:"+value3);
	
			
		
	}
}
