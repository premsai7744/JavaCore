package com.premit.demo.genericinterface;

public class Product implements DataProvider<String>{
	
	private String value;
	
	@Override
	public void set(String t) {
		value = t;
	}
	
	@Override
	public String get() {
		return value;
	}
}
