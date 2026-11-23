package com.premit.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class DemoQueue {
	public static void main(String[] args) {
		
		System.out.println("==Priority Queue==");
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		 //add
		 priorityQueue.add(10);
		 priorityQueue.add(20);
		 priorityQueue.add(30);
		 
		 
		 priorityQueue.offer(40);
		 priorityQueue.offer(50);
		 priorityQueue.offer(60);
		 
		 
		
		 System.out.println("priorityQueue : "+priorityQueue);
		 
		 //remove ele frmo top of queue
		 priorityQueue.poll();
		 System.out.println("priorityQueue after poll : "+priorityQueue);
		 
		 priorityQueue.remove();
		 System.out.println("priorityQueue after remove : "+priorityQueue);
		 
		 //retrieve ele from top of queue
		 Integer retrievedElement = priorityQueue.element();
		 Integer peekedElement = priorityQueue.peek();
	
		 System.out.println("retrievedElement:"+retrievedElement);
		 System.out.println("peekedElement:"+peekedElement);
		 	
		 System.out.println("==Deque==");
		 ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		 //add
		 arrayDeque.addFirst(10);
		 arrayDeque.addFirst(20);
		 
		 arrayDeque.addLast(30);
		 arrayDeque.addLast(40);
		
		 System.out.println("arrayDeque : "+arrayDeque);
		 
		 //remove ele 
		 arrayDeque.pollFirst();
		 System.out.println("arrayDeque after pollFirst : "+arrayDeque);

		 arrayDeque.pollLast();
		 System.out.println("arrayDeque after pollLast : "+arrayDeque);
		 
		 
		 arrayDeque.removeFirst();
		 System.out.println("arrayDeque after removeFirst : "+arrayDeque);
		 
		 arrayDeque.removeLast();
		 System.out.println("arrayDeque after removeLast : "+arrayDeque);
		 
		 
		 //retrieve 
		 Integer peekedFrist = arrayDeque.peekFirst();
		 Integer peekedLast = arrayDeque.peekLast();
	
		 System.out.println("peekedFrist:"+peekedFrist);
		 System.out.println("peekedLast:"+peekedLast);
		 	
	}
}
