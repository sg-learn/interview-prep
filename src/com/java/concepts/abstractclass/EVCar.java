package com.java.concepts.abstractclass;

public class EVCar extends Car_Parent {

	int unitsConsumed;
	double distanceTravelled;
	
	public EVCar(String vehicleNumber, int unitsConsumed, double distanceTravelled) {
		super(vehicleNumber);
		this.unitsConsumed = unitsConsumed;
		this.distanceTravelled = distanceTravelled;
	}
	
	@Override
	double calculateMileage() {
		return (distanceTravelled/unitsConsumed);
	}
}
