package com.premit.demo.genericclasses;

public class Student<K,V> {
	private String id;
	private String name;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("id : "+id+" "+"name : "+name);
	}
}
