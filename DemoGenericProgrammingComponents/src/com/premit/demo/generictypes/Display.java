package com.premit.demo.generictypes;

public class Display<T> {
	
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
