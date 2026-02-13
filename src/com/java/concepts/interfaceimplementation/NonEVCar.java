package com.java.concepts.interfaceimplementation;

public class NonEVCar implements Car{
	
	String vehicleNumber;
	double unitsConsumed;
	double distanceTravelled;
	
	public NonEVCar(String vehicleNumber, double unitsConsumed, double distanceTravelled) {
		this.vehicleNumber = vehicleNumber;
		this.unitsConsumed = unitsConsumed;
		this.distanceTravelled = distanceTravelled;
	}

	@Override
	public void start() {
		System.out.println("Non EV Car "+vehicleNumber+" started");
	}

	@Override
	public void stop() {
		System.out.println("Non EV Car "+vehicleNumber+" stopped");
	}

	@Override
	public double calculateMileage() {
		return (distanceTravelled/unitsConsumed);
	}

}
