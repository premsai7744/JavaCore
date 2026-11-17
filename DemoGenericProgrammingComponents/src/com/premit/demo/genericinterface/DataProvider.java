package com.premit.demo.genericinterface;

public interface DataProvider<T> {
	public abstract void set(T t);
	public abstract T get();
}
