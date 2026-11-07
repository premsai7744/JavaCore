package p1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoMain {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Display ob = new  Display();
		
		Class d = Display.class;
		Method[] m = d.getDeclaredMethods();
		for(Method method : m) {
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				method.invoke(ob);
			}
		}
	}
}
