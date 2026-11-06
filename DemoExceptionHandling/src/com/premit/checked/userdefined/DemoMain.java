package com.premit.checked.userdefined;

import java.util.Scanner;

public class DemoMain extends Exception {
	public DemoMain(String msg) {
		super(msg);
	}
	public void calculateSalary(int basicSalary) throws DemoMain{
		try {
			if(basicSalary<12000) {
				DemoMain ob = new DemoMain("Invalid basic salary!, basic salary must be greater than or equal to 12000.");
				throw ob;
			}
			float totalSalary = basicSalary+(0.93f*basicSalary)+(0.53f*basicSalary);
			System.out.println("TotalSalary:"+totalSalary);
		} catch (DemoMain ob) {
			throw ob;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter basic salary:");
		int basicSalary = s.nextInt();
		DemoMain ob = new DemoMain("");
		try {
			ob.calculateSalary(basicSalary);
		}catch(DemoMain e) {
			System.out.println(e.getMessage());
		}finally {
			s.close();
		}
	}
}
