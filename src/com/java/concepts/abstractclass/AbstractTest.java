package com.java.concepts.abstractclass;

public class AbstractTest {

	public static void main(String[] args) {

		Car_Parent nonEvCarCild = new NonEVCar("NEV_1", 5, 100);
		nonEvCarCild.start();
		System.out.println("Mileage of nonEvCarCild: "+nonEvCarCild.calculateMileage());
		nonEvCarCild.stopped();
		
		Car_Parent evCarChild = new EVCar("EV_1", 10, 205);
		evCarChild.start();
		System.out.println("Mileage of evCarChild: "+evCarChild.calculateMileage());
		evCarChild.stopped();
	}

}
