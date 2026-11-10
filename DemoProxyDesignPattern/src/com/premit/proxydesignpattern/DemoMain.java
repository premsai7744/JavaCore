package com.premit.proxydesignpattern;

import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s){
			System.out.println("Enter password:");
			String password = s.nextLine();
			LockerProxy lockerProxy = new LockerProxy(password);
			lockerProxy.openLocker();
		}
	}
}
