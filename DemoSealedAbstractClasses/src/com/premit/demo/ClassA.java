package com.premit.demo;

public sealed abstract class ClassA permits ClassB, ClassC, ClassD{
	public abstract void methodA();
}
