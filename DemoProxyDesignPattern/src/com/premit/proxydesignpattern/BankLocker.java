package com.premit.proxydesignpattern;

public class BankLocker implements Locker{
	@Override
	public void openLocker() {
		System.out.println("Locker opened.");
	}
}
