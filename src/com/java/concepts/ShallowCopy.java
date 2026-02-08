package com.java.concepts;

public class ShallowCopy {

	public static void main(String[] args) throws Exception {
		Employee1 e1=new Employee1();
		e1.address = new Address();
		e1.address.city="Delhi";
		
		Employee1 e2= (Employee1) e1.clone();
		e2.address.city="Lucknow";
		
		System.out.println("E1 city: "+e1.address.city);
		System.out.println("E2 city: "+e2.address.city);
	}

}

class Employee1 implements Cloneable {
	int id;
	Address address;
	
	 protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	
}
class Address {
    String city;
}
