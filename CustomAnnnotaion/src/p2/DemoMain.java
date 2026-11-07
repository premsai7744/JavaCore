package p2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class DemoMain {
	public static void main(String[] args) {
		Class<Display> c = Display.class;
		MyAnnotation myAnnotation = c.getDeclaredAnnotation(MyAnnotation.class);
		System.out.println(myAnnotation.id());
		System.out.println(myAnnotation.name());
	}
}
