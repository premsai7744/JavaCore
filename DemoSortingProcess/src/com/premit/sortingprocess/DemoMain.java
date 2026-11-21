package com.premit.sortingprocess;

import java.util.ArrayList;
import java.util.Collections;


public class DemoMain {
	public static void main(String[] args) {
		
		/*
		Sorting on list objects can be performed in 2 ways:
		1.using sort() from List interface
		2.using sort() from Collections class
		*/
	
			
		Product p1 = new Product();
		p1.setProductCode("a111");
		p1.setProductName("IPhone");
		p1.setProductPrice(100000.00);
		p1.setProductQty(2);
		
		Product p2 = new Product();
		p2.setProductCode("A111");
		p2.setProductName("Samsung s26");
		p2.setProductPrice(80000.00);
		p2.setProductQty(1);
		

		//1.using sort() from List interface	
	
		ArrayList<Product> listOfProducts = new ArrayList<Product>();
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		
		System.out.println(listOfProducts);
		
		//sort by code
		listOfProducts.sort((x,y)->{
			int result = x.getProductCode().compareTo(y.getProductCode());
			if(result>0) {
				return 1;
			}else if(result<0) {
				return -1;
			} else {
				return 0;
			}
		});
		
		System.out.println("After sorting by code : "+listOfProducts);
		
		//sort by name
		listOfProducts.sort((x,y)->{
			int result = x.getProductName().compareTo(y.getProductName());
			if(result>0) {
				return 1;
			} else if(result<0) {
				return -1;
			}
			return 0;
		});
		System.out.println("After sorting by name : "+listOfProducts);
		
		//sort by price
		listOfProducts.sort((x,y)->{
			int result = Double.compare(x.getProductPrice(), y.getProductPrice());
			return result;
		});
		
		System.out.println("After sorting by price : "+listOfProducts);
	
		//sort by qty
		listOfProducts.sort((x,y)->{
			int result = Integer.compare(x.getProductQty(), y.getProductQty());
			return result;
		});
		
		System.out.println("After sorting by qty : "+listOfProducts);
		
		
		//Sorting on List of wrapper classes.
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(30);
		list2.add(20);
		list2.add(40);
		list2.add(10);
		list2.add(50);
		
		System.out.println("List2 : "+list2);
		list2.sort((x,y)->Integer.compare(x, y));
		System.out.println("List2 after sorting in descending order : "+list2);
		
		list2.sort((x,y)->Integer.compare(y, x));
		System.out.println("List2 after sorting in ascending order : "+list2);
		
		//or
		System.out.println("List2 : "+list2);
		list2.sort((x,y)->x-y);
		System.out.println("List2 after sorting in descending order : "+list2);
		
		list2.sort((x,y)->y-x);
		System.out.println("List2 after sorting in ascending order : "+list2);
	
	
		//2.using sort() from Collections class
		//Wrapper class objects
		Integer a = 80;
		Integer b = 90;
		Integer c = 70;
		Integer d = 100;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		System.out.println("list before sorting : "+list);
		
		Collections.sort(list); //By default ascending order
		System.out.println("list after sorting : "+list);
		
		Collections.sort(list, (x,y)->Integer.compare(y,x)); //Descending order
		System.out.println("list after sorting : custom sorting : "+list);
	
	
		//String class objects
		String str1 = "Redmi";
		String str2 = "Samsung";
		String str3 = "Iphone";
		String str4 = "Motorola";
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add(str1);
		strList.add(str2);
		strList.add(str3);
		strList.add(str4);
		
		System.out.println("strList before sorting:"+strList);
		
		Collections.sort(strList);//default sorting : Ascending order
		
		System.out.println("strList after sorting:"+strList);
		
		Collections.sort(strList, (x,y)->{   //Custom sorting : Descending order
			return y.compareTo(x);
		});
		
		System.out.println("strList after sorting:"+strList);
	
		
		//UserDefined Class Objects

		Product product1 = new Product();
		product1.setProductCode("a111");
		product1.setProductName("Samsung");
		product1.setProductPrice(100000.00);
		product1.setProductQty(2);

		Product product2 = new Product();
		product2.setProductCode("A111");
		product2.setProductName("Iphone");
		product2.setProductPrice(80000.00);
		product2.setProductQty(1);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		
		System.out.println("ProductList:" + productList);
		
		Collections.sort(productList);

		System.out.println("ProductList after sorting:" + productList);
		
		
		Collections.sort(productList, (x,y)->y.getProductName().compareTo(x.getProductName()));
		
		System.out.println("ProductList after sorting:" + productList);
		
	}
}
