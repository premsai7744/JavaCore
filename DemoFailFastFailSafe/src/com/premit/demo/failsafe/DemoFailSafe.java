package com.premit.demo.failsafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoFailSafe {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		
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
			list.add(101); //You don't get concurrent modification exception bcz iterator works on snapshot.
		}
		
		System.out.println(list);
	}
}
