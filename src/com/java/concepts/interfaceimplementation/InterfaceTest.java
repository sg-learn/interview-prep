package com.java.concepts.interfaceimplementation;

public class InterfaceTest {
	
	/*
	 * Interface cannot hold instance variables
	 * 
	 * Interface cannot have constructors
	 * 
	 * Interface cannot share state
	 * 
	 * Interface cannot enforce common implementation (unless default method)
	 */

	public static void main(String[] args) {

		Car nonEVCar = new NonEVCar("NEV_1", 6, 116);
		nonEVCar.congrats();
		nonEVCar.start();
		System.out.println("Mileage of nonEVCar: "+nonEVCar.calculateMileage());
		nonEVCar.stop();
		
		Car evCar = new EVCar("EV_1", 8, 489);
		evCar.congrats();
		evCar.start();
		System.out.println("Mileage of evCar: "+evCar.calculateMileage());
		evCar.stop();

	}

}
