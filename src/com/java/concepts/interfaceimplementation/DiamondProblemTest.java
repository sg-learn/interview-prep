package com.java.concepts.interfaceimplementation;

//public class DiamondProblemTest implements Car, Vehicle {
	
	/*
	 * Since it is a concrete class:
		Java expects:
		✔ All methods from Car
		✔ All methods from Vehicle
		to be implemented. Because it does not which method to implement
		since both Car and Vehicle have same start and stop methods.
		This causes ambiguity and know and Diamond problem.
		If not → compilation error.
	 */

//}

//public abstract class DiamondProblemTest implements Car, Vehicle {
	
	/*
	 * Now this class is abstract.
	 * Abstract class is allowed to:
	 * 👉 Leave methods unimplemented.
	 * It is saying:
	 * I am not giving full implementation. My child class will complete it.
	 * So compiler is satisfied.
	 */
//}
