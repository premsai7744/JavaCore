package com.premit.garbagecollection;

public class DemoMain {
	public static void main(String[] args) {
	
		Employee[] empArray = new Employee[1];
		
		empArray[0] = new Employee("Ram");//Eligible for garbage collection.
		
		empArray[0] = new Employee("Raj");
		
		System.out.println(empArray[0].name);

		
		Employee[] empArray2 = new Employee[1];
		
		empArray2[0] = new Employee("Ram");//Not eligible for garbage collection.
		
		Employee e1 = empArray2[0];
		
		empArray2[0] = new Employee("Raj");
		
		System.out.println(empArray[0].name);
		System.out.println("e1:"+e1.name);
		
		
	}
}
