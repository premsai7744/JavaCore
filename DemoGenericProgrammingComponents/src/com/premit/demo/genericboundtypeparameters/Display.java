package com.premit.demo.genericboundtypeparameters;

public class Display<T extends Number> {
	private T value;
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
}
