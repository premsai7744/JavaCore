package com.premit.demo;

import java.util.Date;

public final class TransactionLog {
	private final long homeAccountNo;
	private final long benificiaryAccountNo;
	private final int amount;
	private Date date;
	
	public TransactionLog(long homeAccountNo,long benificiaryAccountNo,int amount,Date date) {
		this.homeAccountNo = homeAccountNo;
		this.benificiaryAccountNo = benificiaryAccountNo;
		this.amount = amount;
		this.date = date;
	}

	public long getHomeAccountNo() {
		return homeAccountNo;
	}

	public long getBenificiaryAccountNo() {
		return benificiaryAccountNo;
	}

	public int getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}
	
	
}
