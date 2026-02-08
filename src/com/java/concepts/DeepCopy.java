package com.java.concepts;

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee2 e1=new Employee2();
		e1.address = new Address2();
		e1.address.city="Delhi";
		
		Employee2 e2= (Employee2) e1.clone();
		e2.address.city="Lucknow";
		
		System.out.println("E1 city: "+e1.address.city);
		System.out.println("E2 city: "+e2.address.city);

	}

}

class Employee2 implements Cloneable {
	int id;
	Address2 address;

	protected Object clone() throws CloneNotSupportedException {
		Employee2 copy = (Employee2) super.clone();
		copy.address = new Address2();
		copy.address.city = this.address.city;
		return copy;
		
		
		
		
	}

}

class Address2 {
	String city;
}
