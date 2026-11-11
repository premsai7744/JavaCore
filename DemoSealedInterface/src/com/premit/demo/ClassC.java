package com.premit.demo;

public sealed class ClassC implements InterfaceA permits ClassD{
	@Override
	public void methodA() {
		System.out.println("ClassC::methodA()");
	}
}
