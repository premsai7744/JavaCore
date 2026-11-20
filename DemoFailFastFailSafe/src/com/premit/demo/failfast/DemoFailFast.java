package com.premit.demo.failfast;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoFailFast {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer ob = it.next();
			System.out.println(ob);
			list.add(101); //ConcurrentModificationException
		}
	}
}
