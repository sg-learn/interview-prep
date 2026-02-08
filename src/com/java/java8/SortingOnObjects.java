package com.java.java8;

import java.util.ArrayList;
import java.util.List;

import com.java.pojo.Employee;

public class SortingOnObjects {

	public static void main(String[] args) {
		
		Employee  e1 = new Employee(101, "Ray", 33000, "Shimla");
		Employee  e2 = new Employee(102, "Tina", 35000, "Tripura");
		Employee  e3 = new Employee(103, "Nandy", 39000, "Jaipur");
		Employee  e4 = new Employee(104, "Joy", 20000, "Kanpur");
		Employee  e5 = new Employee(105, "Drake", 23000, "Trilokpuri");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);
		
		
		
	}
}
