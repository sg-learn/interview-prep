package com.java.concepts.abstractclass;

// Parent class
public abstract class Car_Parent {
	
	/*
	 * Cannot be instantiated (no object creation directly)
	 * 
	 * Can have both abstract and concrete methods
	 * 
	 * Can have constructors and instance variables
	 */
	
	//instance variable
	String vehicleNumber;
	
	 // constructor
	Car_Parent(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	// common concrete methods
	void start() {
		System.out.println("Vehicle " + vehicleNumber + " started");
	}
	
	void stopped() {
		System.out.println("Vehicle " + vehicleNumber + " stopped");
	}
	
	// abstract method - mileage calculation is different for different vehicle
	abstract double calculateMileage();

}
