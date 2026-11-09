package com.premit.demo;

public class DemoMain {
	public static void main(String[] args) {
		BanksFactory banksfactory = new HdfcBankFactory();
	    BankAccount bankAccount = banksfactory.createBankAccount();
	    bankAccount.createBankAccount();
	    
	    Atm bankAtm = banksfactory.createAtm();
		bankAtm.createAtm();
	}
}
