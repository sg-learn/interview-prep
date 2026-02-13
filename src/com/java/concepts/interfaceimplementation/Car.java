package com.java.concepts.interfaceimplementation;

public interface Car {
	
	/*
	 	* Interface only defines contract.
	 	* 
		* No instance variables.
		* 
		* No constructor.
	 */

	void start();
	void stop();
	double calculateMileage();
	
	default void congrats() {
		System.out.println("You own a 4-wheeler");
	}
	
}
