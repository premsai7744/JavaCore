package com.premit.demo;
public class DemoMain {
	public static void main(String[] args) {
		//Wrapper Classes: to make primitive data types into objects.
		int a = 10;
		
		//Boxing process : To make primitive data type into objects : 2 ways
		//1.using constructor.
		Integer ob1 = new Integer(a);//deprecated
		//2.using valueOf() method from Wrapper Classes.
		Integer ob2 = Integer.valueOf(a);
	 
		System.out.println("Wrapper class objects:");
		System.out.println("ob1 : "+ob1);
		System.out.println("ob2 : "+ob2);
		
		
		//UnBoxing process : To make wrapper classes into primitive datatypes.
		int value1 = ob1.intValue();
		int value2 = ob2.intValue();
		
		System.out.println("Primitive datatypes:");
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		
		//Autoboxing : Automatically converting from primitive datatypes to wrapper class objects.
		Integer ob3 = 20; //Internally Integer.valueOf(20); 
		System.out.println("AutoBoxing:");
		System.out.println(ob3);
		
		//AutoUnBoxing : Automatically converting from Wrapper class object to primitive datatype.
		int x = ob3; //Internally ob3.intValue();
		System.out.println("AutoUnBoxing");
		System.out.println(x);
	
		
		//WrapperClassMethods
		//parseInt(): to convert from string to int data type.
		String version = "17";
		int parsedVersion = Integer.parseInt(version);
		System.out.println("ParsedVersion:"+parsedVersion);
	
		//toString(): to convert from WrapperClasses to String type.
		Integer z = 10;
	    String convertedZtoString = z.toString();
		System.out.println("convertedZtoString:"+convertedZtoString);
		
		//compare() : to compare two Integer objects:
		Integer m = 10;
		Integer n = 20;
		int result = Integer.compare(m, n);
		System.out.println("====compare(m,n)====");
		System.out.println("Result : "+result);
	}
}
