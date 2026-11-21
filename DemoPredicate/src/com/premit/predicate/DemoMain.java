package com.premit.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DemoMain {
	public static void main(String[] args) {
		
		//Predicate: To perform conditional operation on collection objects.
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(39);
		marks.add(40);
		marks.add(30);
		marks.add(50);
		marks.add(99);
		marks.add(70);
		
		System.out.println("Marks : "+marks);		
		
		Predicate<Integer> p = (k)->{
			if(k>=40) {
				return true;
			} else {
				return false;
			}
		};
		
		//To print marks which is greater than or equal to 40
		System.out.println("Marks Greater than or equal to 40");
		for(Integer ob : marks) {
			if(p.test(ob)) {
				System.out.println(ob);
			}
		}
		
		
		//Predicate : and() : Returns true if both are true
		Predicate<Integer> p1 = (k)->k>0;
		Predicate<Integer> p2 = (k)->k<10000;
		
		Predicate<Integer> p3 = p1.and(p2);
		
		boolean result1 = p3.test(-100);
		System.out.println("-100 result : "+result1);
		
		boolean result2 = p3.test(20000);
		System.out.println("20000 result : "+result2);
		
		boolean result3 = p3.test(100);
		System.out.println("100 result : "+result3);
		
		boolean result4 = p3.test(9000);
		System.out.println("9000 result : "+result4);
		
		//Predicate : or() : Returns true if any one of them are true
		Predicate<Integer> p11 = (k)->k>0;
		Predicate<Integer> p22 = (k)->k<10000;
		
		Predicate<Integer> p33 = p11.or(p22); 
		
		boolean result5 = p33.test(10000);
		System.out.println("10000 result : "+result5);
		
		//Predicate : negate() : Return opposite : if true returns false and vice versa.
		Predicate<Integer> p111 = p33.negate();
		boolean result6 = p111.test(10000);
		System.out.println("10000 result : "+result6);
		
		
		
		
	}
}	
