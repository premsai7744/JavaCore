package com.premit.demo;

import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s){
			System.out.println("Enter home account no:");
			long homeAccountNo = s.nextLong();
			System.out.println("Enter beneficiary account no: ");
			long beneficiaryAccountNo = s.nextLong();
			System.out.println("Enter amount: ");
			int amount = s.nextInt();
			
			TransactionLog transactionLog = new TransactionLog(homeAccountNo, beneficiaryAccountNo, amount);
			System.out.println("Transaction-details:");
			System.out.println("Home accountno : "+transactionLog.amount());
			System.out.println("Beneficiary accountno : "+transactionLog.homeAccountNo());
			System.out.println("Amount : "+transactionLog.amount());
		}
	}
}
