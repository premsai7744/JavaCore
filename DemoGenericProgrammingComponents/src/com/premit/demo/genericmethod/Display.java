package com.premit.demo.genericmethod;

public class Display {
	
	//generic method without return type
	public <T> void display(T t) {
		System.out.println(t);
	}
	
	//generic method with return type
	public <T> T getValue(T value) {
		return value;
	}
	
	//generic method with multiple params
	public <T,U> void show(T id,U name) {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
	}
}
