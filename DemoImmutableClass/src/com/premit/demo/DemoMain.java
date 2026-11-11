package com.premit.demo;

import java.util.Date;
import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s){
			try {
				System.out.println("Enter home account no:");
				long homeAccountNo =  s.nextLong();
				System.out.println("Enter beneficiary account no:");
				long beneficiaryAccontNo = s.nextLong();
				System.out.println("Enter amount:");
				int amount = s.nextInt();
				
				TransactionLog transactionLog = new TransactionLog(homeAccountNo, beneficiaryAccontNo, amount, new Date());
				
				System.out.println("==Transaction-Details==");
				System.out.println("Amount : "+transactionLog.getAmount());
				System.out.println("Beneficiary account no : "+transactionLog.getBenificiaryAccountNo());
				System.out.println("Home account no : "+transactionLog.getHomeAccountNo());
				System.out.println("Date : "+transactionLog.getDate());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
