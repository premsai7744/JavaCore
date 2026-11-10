package com.premit.shallowcloning;

public class DemoMain {
	public static void main(String[] args) {
		Address ad = new Address();
		ad.setCity("HYD");
		ad.setPinCode(500072);
		ad.setState("TG");
		System.out.println("ad : "+ad);
		
	   Employee emp = new Employee();
	   emp.setAddress(ad);
	   emp.setEmpId(101);
	   emp.setEmpName("Ram");
	   System.out.println("emp : "+emp);

	   System.out.println("==Original Objects==");
	   System.out.println("emp : "+emp);
	   System.out.println("emp.address : "+emp.getAddress());
	   System.out.println("==hashcodes==");
	   System.out.println("emp:"+emp.hashCode());
	   System.out.println("address:"+emp.getAddress().hashCode());
	   
	   try {
		   Employee emp2 = (Employee)emp.getClone();
		   System.out.println("===Cloned objects==");
		   System.out.println("emp2 : "+emp2);
		   System.out.println("emp2.address : "+emp2.getAddress());
		   System.out.println("==hashcodes==");
		   System.out.println("emp2:"+emp2.hashCode());
		   System.out.println("address2:"+emp2.getAddress().hashCode());
		      
	   } catch (CloneNotSupportedException cnse) {
		   cnse.printStackTrace();
	   }
	   
	}
}
