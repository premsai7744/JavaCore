package com.premit.deepcloning;

public class Address implements Cloneable{
	private String city;
	private String state;
	private long pinCode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	
	public Object getClone2() throws CloneNotSupportedException {
		return super.clone();
	}
}
