package com.premit.deepcloning;

public class DemoMain {
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("HYD");
		address.setPinCode(500072);
		address.setCity("TG");
		
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("Ram");
		employee.setAddress(address);
		
		System.out.println("==Original-Objects==");
		System.out.println("employee : "+employee);
		System.out.println("employe.getAddress() : "+employee.getAddress());
		
		System.out.println("==HashCodes==");
		System.out.println("employee : "+employee.hashCode());
		System.out.println("address : "+employee.getAddress().hashCode());
		
		try {
			Employee clonedEmployee = (Employee)employee.getClone1();
			System.out.println("==Cloned-Objects==");
			System.out.println("clonedEmployee : "+clonedEmployee);
			System.out.println("clonedEmplyee.getAddress()"+clonedEmployee.getAddress());
			System.out.println("==HashCodes==");
			System.out.println("employee : "+clonedEmployee.hashCode());
			System.out.println("address : "+clonedEmployee.getAddress().hashCode());
			
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		
	}
}
