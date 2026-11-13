package com.premit.demo;

import java.util.StringJoiner;

public class DemoMain {
	public static void main(String[] args) {
		StringJoiner ob = new StringJoiner("/");
		ob.add("15");
		ob.add("08");
		ob.add("1947");
		System.out.println(ob);
		
		StringJoiner ob2 = new StringJoiner("-");
		ob2.add("Independence");
		ob2.add("Day");
		
		ob.merge(ob2);
		System.out.println(ob);
		
		StringJoiner ob3 = new StringJoiner("");
		ob3.setEmptyValue("ob3 is empty.");
		System.out.println(ob3);
	}

}
