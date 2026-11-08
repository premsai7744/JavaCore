package com.premit.earlyinstantiation;

public class Test {
	
	//private static ref variable
	private static Test ob = null;
	
	//private constructor
	private Test() {}
	
	//static block for object creation : Early instantiation
	static {
		ob = new Test();
	}
	
	//static method
	public static Test getRef() {
		return ob;
	}
}
