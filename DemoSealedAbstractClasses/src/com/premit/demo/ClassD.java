package com.premit.demo;

public sealed class ClassD extends ClassA permits ClassE{
	@Override
	public void methodA() {
		System.out.println("ClassD::methodA()");
	}

}
