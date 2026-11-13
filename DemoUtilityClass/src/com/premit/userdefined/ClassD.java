package com.premit.userdefined;

import java.util.Scanner;

public class ClassD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s){
			System.out.println("Enter value 1 : ");
			int value1 = s.nextInt();
			System.out.println("Enter value 2 : ");
			int value2 = s.nextInt();
			int result = MyUtilityClass.maxOfTwoNos(value1, value2);
			System.out.println("Result : "+result);
		}
	}
	
}
