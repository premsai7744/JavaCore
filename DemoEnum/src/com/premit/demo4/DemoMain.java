package com.premit.demo4;

import java.util.Arrays;
import java.util.Spliterator;

public class DemoMain {
	public static void main(String[] args) {
		Courses[] courses = Courses.values();
		Spliterator<Courses> sp = Arrays.spliterator(courses);
		sp.forEachRemaining((k)->{
			System.out.println("CourseName:"+k.toString()+" "+"CoursePrice:"+k.getPrice());
		});
	}
}
