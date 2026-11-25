package com.premit.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiPredicate;

public class DemoMap {
	public static void main(String[] args) {
		//HashMap: without any order
		HashMap<String, Product> hashMap = new HashMap<String, Product>();
		
		//put();
		hashMap.put("A101", new Product("IPhone18", 80000.00d, 1));
		hashMap.put("A102", new Product("Samsungs26", 100000.00d, 2));
		hashMap.put("A103", new Product("Redmi20", 120000.00d, 3));
		hashMap.put("A104", new Product("PocoX8", 30000.00d, 4));
		System.out.println("==hashMap==");
		System.out.println(hashMap);
		
		//LinkedHashMap: insertion order
		LinkedHashMap<String, Product> linkedHashMap = new LinkedHashMap<String, Product>();
		
		linkedHashMap.put("A101", new Product("IPhone18", 80000.00d, 1));
		linkedHashMap.put("A102", new Product("Samsungs26", 100000.00d, 2));
		linkedHashMap.put("A103", new Product("Redmi20", 120000.00d, 3));
		linkedHashMap.put("A104", new Product("PocoX8", 30000.00d, 4));
		
		System.out.println("==linkedHashMap==");
		System.out.println(linkedHashMap);
		

		//TreeMap: ascending order
		TreeMap<String, Product> treeMap = new TreeMap<String, Product>();
		
		treeMap.put("A101", new Product("IPhone18", 80000.00d, 1));
		treeMap.put("A102", new Product("Samsungs26", 100000.00d, 2));
		treeMap.put("A103", new Product("Redmi20", 120000.00d, 3));
		treeMap.put("A104", new Product("PocoX8", 30000.00d, 4));
		
		System.out.println("==treeMap==");
		System.out.println(treeMap);
		
		//Methods 
		//putAll();
		System.out.println("==putAll()==");
		
		HashMap<String, Product> hashMap1 = new HashMap<String, Product>();
		HashMap<String, Product> hashMap2 = new HashMap<String, Product>();
		
		//put();
		hashMap1.put("A101", new Product("IPhone18", 80000.00d, 1));
		hashMap1.put("A102", new Product("Samsungs26", 100000.00d, 2));
		hashMap1.put("A103", new Product("Redmi20", 120000.00d, 3));
		hashMap1.put("A104", new Product("PocoX8", 30000.00d, 4));
		System.out.println("==hashMap1==");
		System.out.println(hashMap1);
		
	
		//put();
		hashMap2.put("A105", new Product("Vivo", 80000.00d, 1));
		hashMap2.put("A106", new Product("Oppo", 100000.00d, 2));
		hashMap2.put("A107", new Product("Realme", 120000.00d, 3));
		hashMap2.put("A108", new Product("onePlus", 30000.00d, 4));
		System.out.println("==hashMap2==");
		System.out.println(hashMap2);
		
		hashMap1.putAll(hashMap2);
		System.out.println("==hashMap1 after putAll()==");
		System.out.println(hashMap1);
		
		//remove(key)
		System.out.println("remove(key)");
		
		HashMap<String, Product> hashMap3 = new HashMap<String, Product>();
		
		hashMap3.put("A101", new Product("IPhone18", 80000.00d, 1));
		hashMap3.put("A102", new Product("Samsungs26", 100000.00d, 2));
		hashMap3.put("A103", new Product("Redmi20", 120000.00d, 3));
		hashMap3.put("A104", new Product("PocoX8", 30000.00d, 4));
	
		System.out.println("==hashMap3==");
		System.out.println(hashMap3);
		
		hashMap3.remove("A101");
		System.out.println("remmove(A101)");
		System.out.println("==hashMap3==");
		System.out.println(hashMap3);
		
		//replaceAll()
		System.out.println("==ReplaceAll()==");
		
		HashMap<String, Product> hashMap4 = new HashMap<String, Product>();
		
		hashMap4.put("A101", new Product("IPhone18", 80000.00d, 1));
		hashMap4.put("A102", new Product("Samsungs26", 100000.00d, 2));
		hashMap4.put("A103", new Product("Redmi20", 120000.00d, 3));
		hashMap4.put("A104", new Product("PocoX8", 30000.00d, 4));
	
		System.out.println("hashMap4");
		System.out.println(hashMap4);
	
		hashMap4.replaceAll((k,v)->{
			double price = v.getPrice();
			v.setPrice(price*2.0d);
			return v;
		});
		System.out.println("hashmap4:");
		System.out.println(hashMap4);
		
		//keySet()
		System.out.println("==keySet()==");
		
		HashMap<String, Product> hashMap5 = new HashMap<String, Product>();
		
		hashMap5.put("A101", new Product("IPhone18", 80000.00d, 1));
		hashMap5.put("A102", new Product("Samsungs26", 100000.00d, 2));
		hashMap5.put("A103", new Product("Redmi20", 120000.00d, 3));
		hashMap5.put("A104", new Product("PocoX8", 30000.00d, 4));
	
		Set<String> allKeys = hashMap5.keySet();
		System.out.println("AllKeys : "+allKeys);
		
		//values()
		System.out.println("==values()==");
		Collection<Product> collection = hashMap5.values();
		collection.forEach(v->System.out.println(v));
		
		//get(key)
		System.out.println("==get(key)==");
		Product retrievedProduct = hashMap5.get("A101");
		System.out.println("Product with A101 : "+retrievedProduct);
		
		//entrySet();
		System.out.println("==entrySet()==");
		for(Map.Entry<String, Product> entry : hashMap5.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue().toString());
		}
		
		//to retrieve ele's which is  have price less than 1 lakh 
		HashMap<String, Product> hashMap6 = new HashMap<String, Product>();
		
		hashMap6.put("A101", new Product("IPhone18", 80000.00d, 1));
		hashMap6.put("A102", new Product("Samsungs26", 100000.00d, 2));
		hashMap6.put("A103", new Product("Redmi20", 120000.00d, 3));
		hashMap6.put("A104", new Product("PocoX8", 30000.00d, 4));
	
		System.out.println("==hashMap6==");
		System.out.println(hashMap6);
		
		BiPredicate<String, Product> biPredicate1 = (k,v)->{
			if(v.getPrice()<100000) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println("==Products price less than 1 lakh==");
		hashMap6.forEach((k,v)->{
			if(biPredicate1.test(k, v)) {
				System.out.println(k+" "+v);
			}
		});
		
		//to retrieve ele's which is  have qty less than 3
		BiPredicate<String, Product> biPredicate2 = (k,v)->{
			if(v.getQty()<3) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println("==Products qty less than 3==");
		hashMap6.forEach((k,v)->{
			if(biPredicate2.test(k, v)) {
				System.out.println(k+" "+v);
			}
		});
	
	}
}
