package com.premit.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class DemoList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(50);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(10);
		arrayList.add(40);
		
		System.out.println("==arrayList==");
		System.out.println(arrayList);
		
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(50);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(10);
		linkedList.add(40);
		
		System.out.println("==linkedList==");
		System.out.println(linkedList);
		
		System.out.println("==Vector==");
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(50);
		v.addElement(20);
		v.addElement(30);
		v.addElement(10);
		v.addElement(40);
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			Integer ob = e.nextElement();
			System.out.println(ob);
		}
		
		System.out.println("==Stack==");
		Stack<Integer> stack = new Stack<Integer>();
		//To add ele to stack
		stack.push(10);
		stack.push(30);
		stack.push(20);
		stack.push(40);
		stack.push(50);
		System.out.println("stack:"+stack);
		
		//To remove top element from stack
		stack.pop();
		System.out.println("stack after pop:"+stack);
		
		//To display ele from top of stack
		Integer ele = stack.peek();
		System.out.println("ele from peek() :"+ele);
		
		//To search position of object
		int position = stack.search(10);
		System.out.println("search(10) : "+position);
		
		//To check stack is empty or not
		boolean isStackEmpty = stack.empty();
		System.out.println("isStackEmpty:"+isStackEmpty);
	}
}
