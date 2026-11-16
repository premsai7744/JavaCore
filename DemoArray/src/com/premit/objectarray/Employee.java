package com.premit.objectarray;

public class Employee {
	public String name;
	
	public Employee(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Name : "+name;
	}
}
