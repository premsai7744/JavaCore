package com.premit.demo.privateclasses;

public class Outer {
	private static class InnerOne{
		public void  m1() {
			System.out.println("InnerOne::m1()");
		}
		public static void  m2() {
			System.out.println("InnerOne::m2()");
		}
		
	}
	private class InnerTwo{
		public void  m1() {
			System.out.println("InnerTwo::m1()");
		}
		public static void  m2() {
			System.out.println("InnerTwo::m2()");
		}
	}
	
	public void access() {
		InnerOne innerOne = new InnerOne();
		InnerTwo innerTwo =  new InnerTwo();
		
		innerOne.m1();
		innerOne.m2();
		
		innerTwo.m1();
		innerTwo.m2();
	}
	
}
