package com.premit.objectarray;
public class DemoMain {
	public static void main(String[] args) {
		Object[] objArray = new Object[3]; //Object array holds Dis-similar objects.
		objArray[0] = Integer.valueOf(10);//object array  holding WrapperClass object. 
		objArray[1] = new String("Java");//object array holding StringClass object.
		objArray[2] = new Employee("Ram");//object array holding UserDefinedClass object.
		
		for(Object ob : objArray) {
			System.out.println(ob.toString());
		}
	}
}
