package com.premit.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoMain {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		
		Display d = new Display();

		Class c = Display.class;
		
		Method[] m = c.getDeclaredMethods();
		
		for(Method method : m) {
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				method.invoke(d);
			}
		}
		
		
	}

}
