package com.premit.demo.commonmethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DemoMethods {
	public static void main(String[] args) {
	       ArrayList<Integer> al = new ArrayList<>(); //Not specifying size like array.
	       al.add(100);
	       al.add(200);

	       Integer value1 = al.get(0);
	       Integer value2 = al.get(1);
	       System.out.println("value1:"+value1);
	       System.out.println("value2:"+value2);

	       int sizeOfAl = al.size();
	       System.out.println("size of al : "+al.size());

	       ArrayList<String> al2 = new ArrayList<>();
	       al2.add("Ram");
	       al2.add("Shiva");

	       for(String value : al2){
	           System.out.println(value.toUpperCase());
	       }

	       for(int i=0;i<al.size();i++){
	           String value = al2.get(i);
	           System.out.println(value.toUpperCase());
	       }

	       Iterator<String> it = al2.iterator();
	       System.out.println("using iterator");
	       while(it.hasNext()){
	           String value = it.next();
	           System.out.println(value);
	       }

	       /*
	       System.out.println("remove(Object)");
	       boolean result = al2.remove("Ram");
	       System.out.println("result:"+result);
	       System.out.println(al2);
	       */

	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(1);
	        arrayList.add(1);
	        arrayList.add(1);
	       System.out.println("ArrayList:"+arrayList);
	       System.out.println("Size of ArrayList:"+arrayList.size());

	       HashSet<Integer> hashSet = new HashSet<>();
	       hashSet.add(1);
	       hashSet.add(1);
	       hashSet.add(1);
	       System.out.println("HashSet:"+hashSet);
	       System.out.println("Size of hashSet:"+hashSet.size());


	       ArrayList<Character> characterArrayList = new ArrayList<>();
	       characterArrayList.add('A');
	       characterArrayList.add('E');
	       characterArrayList.add('D');
	       characterArrayList.add('C');
	       characterArrayList.add('B');
	       characterArrayList.add('A');
	       System.out.println("characterArrayList:"+characterArrayList);
	       characterArrayList.remove(Character.valueOf('A'));
	       System.out.println("characterArrayList:"+characterArrayList);

	       ArrayList<Integer> intArrayList =  new ArrayList<>();
	       intArrayList.add(111);
	       intArrayList.add(222);
	       intArrayList.add(333);
	       intArrayList.add(444);
	       intArrayList.add(555);
	       System.out.println("intArrayList:"+intArrayList);

	   /*    intArrayList.add(1,999);
	       System.out.println("intArrayList:"+intArrayList);
	*/
	       System.out.println("intArrayList:"+intArrayList);
	       intArrayList.add(intArrayList.size(),999);
	       System.out.println("intArrayList:"+intArrayList);

	       intArrayList.clear();
	       System.out.println("intArrayList:"+intArrayList);

	       ArrayList<Integer> intArrayList2 =  new ArrayList<>();
	       intArrayList2.add(111);
	       intArrayList2.add(222);
	       intArrayList2.add(333);
	       intArrayList2.add(444);
	       intArrayList2.add(555);
	       System.out.println("intArrayList2:"+intArrayList2);

	       intArrayList2.addFirst(999);
	       intArrayList2.addLast(999);
	       System.out.println("intArrayList2:"+intArrayList2);

	       intArrayList2.removeFirst();
	       intArrayList2.removeLast();
	       System.out.println("intArrayList2:"+intArrayList2);

	       ArrayList<Integer> list1 = new ArrayList<>();
	       list1.add(1);
	       list1.add(2);
	       list1.add(2);
	       list1.add(2);
	       list1.add(3);
	       System.out.println("list1:"+list1);

	       ArrayList<Integer> list2 = new ArrayList<>();
	       list2.add(1);
	       list2.add(5);
	       list2.add(5);
	       list2.add(5);
	       list2.add(3);
	       System.out.println("list2:"+list2);

	/*
	       list1.addAll(list2);
	       System.out.println("After adding list2 to list1 : ");
	       System.out.println("list1:"+list1);

	*/
	       System.out.println("List1 : "+list1);
	       System.out.println("List2 : "+list2);
	       list1.removeAll(list2);
	       System.out.println("List1 : "+list1);
	       System.out.println("list2 : "+list2);

	       System.out.println("==list1==");
	       System.out.println(list1);
	       System.out.println("==list2==");
	       System.out.println(list2);

	       /*System.out.println(list1.contains(2));
	       System.out.println(list1.containsAll(list2));
	       */

	       System.out.println("==list2.getFirst()==");
	       System.out.println(list2.getFirst());
	       System.out.println("==list2.getLast()==");
	       System.out.println(list2.getLast());

	       System.out.println("==indexOf()==");
	       System.out.println(list2.indexOf(5));

	       System.out.println("==lastIndexOf()==");
	       System.out.println(list2.lastIndexOf(5));

	       System.out.println("isEmpty()");
	       System.out.println(list2.isEmpty());

	       ArrayList<Integer> list3 = new ArrayList<>();
	       if(list3.size()==0){
	           System.out.println("list is empty");
	       }

	       ArrayList<Integer> list4 = new ArrayList<>();
	       list4.add(1);
	       list4.add(2);
	       list4.add(2);
	       list4.add(2);
	       list4.add(3);
	       System.out.println("list4:"+list4);

	       ArrayList<Integer> list5= new ArrayList<>();
	       list5.add(1);
	       list5.add(5);
	       list5.add(5);
	       list5.add(5);
	       list5.add(3);
	       System.out.println("list5:"+list5);

	       list4.retainAll(list5);
	       System.out.println("After retain all");
	       System.out.println(list4);

	       System.out.println("==reverse==");
	       System.out.println(list4);
	       System.out.println(list4.reversed());

	       System.out.println("==set()==");
	       list4.set(1,9);
	       System.out.println(list4);

	       System.out.println("==sort()==");
	       list4.sort((x,y)->y-x);
	       System.out.println(list4);

	       System.out.println("==sublist==");

	       ArrayList<Integer> list9 = new ArrayList<>();
	       list9.add(1);
	       list9.add(2);
	       list9.add(3);
	       list9.add(4);
	       list9.add(5);

	       System.out.println(list9);
	       System.out.println(list9.subList(1,4));

	       System.out.println("==toArray()==");
	       Object[] objArray = list9.toArray();
	       for(Object o : objArray)
	       {
	           Integer a = (Integer)o;
	           System.out.println(a);
	       }
	}
}
