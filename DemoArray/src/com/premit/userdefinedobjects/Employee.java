package com.premit.userdefinedobjects;

public class Employee {
	private String employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	
	@Override
	public String toString() {
		return employeeId+" "+employeeName+" "+employeeSalary;
	}
	
}
