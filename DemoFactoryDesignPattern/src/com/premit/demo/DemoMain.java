package com.premit.demo;

public class DemoMain {
	public static void main(String[] args) {
		Vehicle vehicle1 = Access.getVehicle("car");
		vehicle1.drive();
		
		Vehicle vehicle2 = Access.getVehicle("Bike");
		vehicle2.drive();
	}
}
