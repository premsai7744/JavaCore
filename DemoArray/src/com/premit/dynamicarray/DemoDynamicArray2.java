package com.premit.dynamicarray;

import java.util.Arrays;
import java.util.Scanner;

public class DemoDynamicArray2 {
	/*
	 * when array capacity reaches to 70% create dynamic array.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[10]; //Array created with default size 5
		System.out.println("Array length with default capacity : "+a.length);
		
		int size = 0;
		int capacity = 10;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter "+(i+1)+" element");
			a[i] = s.nextInt();
			if(size>=capacity*0.7) {
				a = Arrays.copyOf(a, capacity*2);
			}
			System.out.println("length:"+a.length);
			size++;
		}
		System.out.println("Array length after increasing capacity : "+a.length);
		s.close();
	}
}
