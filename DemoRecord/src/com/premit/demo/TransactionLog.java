package com.premit.demo;

public record TransactionLog(long homeAccountNo,long beneficiaryAccountNom,int amount) {
	public TransactionLog{
		if(amount<0) {
			throw new IllegalArgumentException("Invalid amount!");
		}
	}
}
