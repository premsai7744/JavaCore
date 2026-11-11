package com.premit.demo;

public sealed class ClassD extends ClassA permits ClassE{
	public void methodD() {
		System.out.println("==methodD()==");
	}
}
