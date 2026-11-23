package com.premit.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoSet {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(50);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(10);
		hashSet.add(40);
		
		System.out.println("==hashSet==");
		System.out.println(hashSet);
		
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(50);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		linkedHashSet.add(40);
		
		System.out.println("==linkedHashSet==");
		System.out.println(linkedHashSet);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(40);
		
		System.out.println("==treeSet==");
		System.out.println(treeSet);
		
		
		
		
	}
}
