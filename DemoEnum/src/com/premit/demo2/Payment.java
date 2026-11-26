package com.premit.demo2;

public enum Payment {
	SUCCESS(200),
	FAILED(400),
	PENDING(100);

	private int code;
	
	private Payment(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
}
