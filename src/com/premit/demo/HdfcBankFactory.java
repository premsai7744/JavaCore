package com.premit.demo;

public class HdfcBankFactory implements BanksFactory{
	@Override
	public Atm createAtm() {
		return new HdfcAtm();
	}
	
	@Override
	public BankAccount createBankAccount() {
		return new HdfcBankAccount();
	}
}
