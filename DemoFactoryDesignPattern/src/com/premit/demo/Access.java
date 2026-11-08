package com.premit.demo;

public class Access {
	

	
	public static Vehicle getVehicle(String type) {
		
		if(type.equalsIgnoreCase("CAR")) {
			return new Car();
		}
		else if(type.equalsIgnoreCase("BIKE")) {
			return new Bike();
		}
		
		throw new IllegalArgumentException("Invalid input type.");
	}
	
}
