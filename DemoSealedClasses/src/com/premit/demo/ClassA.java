package com.premit.demo;

public sealed class ClassA permits ClassB,ClassC,ClassD{
	public void methodA() {
		System.out.println("==methodA()==");
	}
}
