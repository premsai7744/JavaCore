package com.premit.demo;

public interface BanksFactory {
	public abstract Atm createAtm();
	public abstract BankAccount createBankAccount();
}
