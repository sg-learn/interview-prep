package com.java.concepts.interfaceimplementation;

public class EVCar implements Car{
	
	String vehicleNumber;
	double fuelConsumed;
	double distanceTravelled;
	
	public EVCar(String vehicleNumber, double fuelConsumed, double distanceTravelled) {
		this.vehicleNumber = vehicleNumber;
		this.fuelConsumed = fuelConsumed;
		this.distanceTravelled = distanceTravelled;
	}

	@Override
	public void start() {
		System.out.println("EV Car "+vehicleNumber+" started");
	}

	@Override
	public void stop() {
		System.out.println("EV Car "+vehicleNumber+" stopped");
	}

	@Override
	public double calculateMileage() {
		return (distanceTravelled/fuelConsumed);
	}
	

}
