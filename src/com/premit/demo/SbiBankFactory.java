package com.premit.demo;

public class SbiBankFactory implements BanksFactory {
	@Override
	public Atm createAtm() {
		return new SbiAtm();
	}
	@Override
	public BankAccount createBankAccount() {
		return new SbiBankAccount();
	}
}
