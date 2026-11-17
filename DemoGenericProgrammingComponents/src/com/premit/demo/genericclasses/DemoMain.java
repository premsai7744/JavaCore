package com.premit.demo.genericclasses;
public class DemoMain {
	public static void main(String[] args) {
		//Generic class with single param.
		Employee<String> employee = new Employee<>();
		employee.setValue("Java");
		
		String value = employee.getValue();
		System.out.println("value : "+value);
	
	
		//Generic class with multiple params.
		Student<String,String> student = new Student<>();
		student.setId("101");
		student.setName("Raj");
		
		student.display();
	
	}
}
