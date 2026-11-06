package com.premit.unchecked.predefined;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		try {
			System.out.println("Enter basic salary:");
			int basicSalary = s.nextInt();
			float totalSalary = basicSalary+(0.93f*basicSalary)+(0.53f*basicSalary);
			System.out.println("BasicSalary:"+basicSalary);
			System.out.println("TotalSalary:"+totalSalary);				
		}catch(InputMismatchException ime) {
			System.out.println("Invalid values entered! Please enter integer values only.");
		}	
		finally {
			s.close();
		}
	}
}
