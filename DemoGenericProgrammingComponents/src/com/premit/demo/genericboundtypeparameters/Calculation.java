package com.premit.demo.genericboundtypeparameters;

public class Calculation {
	public static <T extends Number> void add(T value1,T value2) {
		double result = value1.doubleValue()+value2.doubleValue();
		System.out.println("add : "+result);
	}
}
