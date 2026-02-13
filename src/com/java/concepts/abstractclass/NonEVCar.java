package com.java.concepts.abstractclass;

public class NonEVCar extends Car_Parent {
	
	double fuelConsumed;
	double distanceTravelled;
	
	NonEVCar(String vehicleNumber, double fuelConsumed, double distanceTravelled) {
		super(vehicleNumber);
		this.fuelConsumed = fuelConsumed;
		this.distanceTravelled = distanceTravelled;
	}

	@Override
	double calculateMileage() {
		return (distanceTravelled/fuelConsumed);
	}

}
