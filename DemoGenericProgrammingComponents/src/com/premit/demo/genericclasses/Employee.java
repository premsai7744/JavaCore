package com.premit.demo.genericclasses;

//Generic class with single TypeParameter
public class Employee<T> {
	private T value;
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
}
