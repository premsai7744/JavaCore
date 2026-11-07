package com.premit.demo.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoMain extends Exception {

	public DemoMain(String msg) {
		super(msg);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter bSal:");
			int bSal = s.nextInt();
			
			if(bSal<=12000) {
				DemoMain ob = new DemoMain("Invalid basic salary, Basic salary must be greater than 12000.");
				throw ob;
			}
			float totalSalary = bSal+(0.93f*bSal)+(0.63f*bSal);
			System.out.println("TotalSalary : "+totalSalary);
		}
		catch(InputMismatchException | DemoMain ob) {
			System.out.println(ob.getMessage());
		}
		finally {
			s.close();
		}
	}

}
