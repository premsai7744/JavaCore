package com.premit.demo;

public class DemoMain {

	public static void main(String[] args) {
		Class<Display> c = Display.class;
		Student s = c.getAnnotation(Student.class);
		
		System.out.println(s.id());
		System.out.println(s.name());
	}

}
