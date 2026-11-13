package com.premit.predefined;

import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s){
			System.out.println("Enter no to find sqrt:");
			int no = s.nextInt();
			double result = Math.sqrt(no);
			System.out.println("Result : "+result);
		}
	}
}	
