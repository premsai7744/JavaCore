package com.premit.checked.predefined;

public class DemoMain {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver class loaded.");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("class not found.");
		}
	}
}
