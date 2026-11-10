package com.premit.deepcloning;

public class Employee implements Cloneable{
	private int empId;
	private String empName;
	private Address address;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Object getClone1() throws CloneNotSupportedException {
		Employee e = (Employee)super.clone();
		e.address = (Address)e.address.getClone2();
		return e;
	}
}
