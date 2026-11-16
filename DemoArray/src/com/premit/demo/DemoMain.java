package com.premit.demo;

import java.util.Arrays;
import java.util.Spliterator;

public class DemoMain {
	public static void main(String[] args) {
		Integer[] a = new Integer[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println("Display using for loop:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Display using enhanced for loop:");
		for(Integer no : a) {
			System.out.println(no);
		}
		
		System.out.println("Display using while loop:");
		int i=0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		
		System.out.println("Display using SplIterator:");
		Spliterator<Integer> sp = Arrays.spliterator(a);
		sp.forEachRemaining((k)->System.out.println(k));
	}
}
