package com.premit.proxydesignpattern;

public class LockerProxy implements Locker{
	
	private String password;
	private Locker locker;
	
	public LockerProxy(String password) {
		this.password = password;
	}
	
	@Override
	public void openLocker() {
		if(password.equals("12345")) {
			System.out.println("Authentication successful.");
			locker = new BankLocker();
		 	locker.openLocker();
		} else {
			System.out.println("Authentication failed!, Locker not opened.");
		}
	}
}
