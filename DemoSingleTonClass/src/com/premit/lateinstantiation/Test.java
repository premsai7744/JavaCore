package com.premit.lateinstantiation;

public class Test {
	private static Test ob=null;
	private Test() {
		
	}
	public static Test getRef() {
		if(ob==null) {  
			ob = new Test(); //Late instantiation
		}
		return ob;
	}
}
