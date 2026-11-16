package com.premit.userdefinedobjects;

import java.util.Arrays;
import java.util.Spliterator;

public class DemoMain {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmployeeId("E1");
		emp1.setEmployeeName("Ram");
		emp1.setEmployeeSalary(100000.00);
		
		Employee emp2 = new Employee();
		emp2.setEmployeeId("E2");
		emp2.setEmployeeName("Raj");
		emp2.setEmployeeSalary(200000.00);
		
		Employee emp3 = new Employee();
		emp3.setEmployeeId("E3");
		emp3.setEmployeeName("Dilip");
		emp3.setEmployeeSalary(300000.00);
		
		Employee emp4 = new Employee();
		emp4.setEmployeeId("E4");
		emp4.setEmployeeName("Sai");
		emp4.setEmployeeSalary(400000.00);
		
		Employee emp5 = new Employee();
		emp5.setEmployeeId("E5");
		emp5.setEmployeeName("Shiva");
		emp5.setEmployeeSalary(500000.00);
		
		/*
		Employee[] empArray = new Employee[5];
		empArray[0] = emp1;
		empArray[1] = emp2;
		empArray[2] = emp3;
		empArray[3] = emp4;
		empArray[4] = emp5;
		*/
		
		Employee[] empArray = {emp1,emp2,emp3,emp4,emp5};
		
		Spliterator<Employee> sp = Arrays.spliterator(empArray);
		sp.forEachRemaining(k->System.out.println(k));
		
	}
}
