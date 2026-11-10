package com.premit.shallowcloning;

public class Address extends Object{
	private String city;
	private String state;
	private long pinCode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String string) {
		this.city = string;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
