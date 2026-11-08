package com.premit.withoutsingletonclass;

public class DemoMain {

	public static void main(String[] args) {
		Test ob1 = new Test();
		Test ob2 = new Test();
		Test ob3 = new Test();
		Test ob4 = new Test();
		
		System.out.println("ob1:"+ob1);
		System.out.println("ob2:"+ob2);
		System.out.println("ob3:"+ob3);
		System.out.println("ob4:"+ob4);
	}

}
