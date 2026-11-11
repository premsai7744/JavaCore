package com.premit.demo;

public sealed interface InterfaceA permits ClassA, ClassB, ClassC{
	public abstract void methodA();
}
