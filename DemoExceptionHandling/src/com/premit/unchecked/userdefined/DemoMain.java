package com.premit.unchecked.userdefined;

import java.util.Scanner;

public class DemoMain extends Exception{
	public DemoMain(String msg) {
		super(msg);
	}
	
	public void calculateTotalSalary(int basicSalary) {
		try {
			if(basicSalary<12000) {
				DemoMain ob = new DemoMain("Invalid basic salary entered!, Basic salary must be greater than or equal to 12000.");
				throw ob;
			}
			float totalSalary = basicSalary+(0.93f*basicSalary)+(0.56f*basicSalary);
			System.out.println("TotalSalary:"+totalSalary);
		} catch (DemoMain ob) {
			System.out.println(ob.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter basic salary:");
		int basicSalary = s.nextInt();
		DemoMain ob = new DemoMain("");
		ob.calculateTotalSalary(basicSalary);
		s.close();
	}
}
