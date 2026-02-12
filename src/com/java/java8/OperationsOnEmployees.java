package com.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java.pojo.Employee;

public class OperationsOnEmployees {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>(Arrays.asList( //new ArrayList<Employee> - makes the list modifiable to add/remove employee. Arrays.asList make the list fixed-size
								new Employee(101, "Payal", 25000, "IT"),
								new Employee(102, "Asin", 45000, "Admin"),
								new Employee(103, "Sumesh", 20000, "Support"),
								new Employee(104, "Nayan", 90000, "IT"),
								new Employee(105, "Kasak", 69000, "HR"),
								new Employee(106, "Avishkar", 23000, "IT"),
								new Employee(107, "Pooja", 78000, "TMS"),
								new Employee(108, "Poonam", 13000, "Support"),
								new Employee(109, "Devesh", 97000, "IT"),
								new Employee(110, "Prithvi", 76000, "HR")
								));
		
		sortEmployeesBasedOnNames(list); System.out.println();
		sortEmployeeBasedOnSalary(list); System.out.println();
		employeeWithHighestSalary(list); System.out.println();
		employeeWithSecondHighestSalary(list); System.out.println();
		employeeWithSalaryMoreThan30000(list); System.out.println();
		employeesInITDepartment(list); System.out.println();
		firstEmployeeFromITDepartment(list); System.out.println();
		groupEmployeesByDepartmentAndPrintNames(list); System.out.println();
		countEmployeesInEachDepartment(list); System.out.println();
		employeeWithHighestSalaryInEachDepartment(list); System.out.println();
		sortEmployeesInEachDepartment(list);  System.out.println();
		averageSalary(list); System.out.println();
		averageSalaryInAdminDepartment(list);  System.out.println();
		averageSalaryInEachDepartment(list);  System.out.println();
	}

	private static void sortEmployeesBasedOnNames(List<Employee> list) {
		System.out.println("***************** sortEmployeesBasedOnNames *****************");
		list.stream().sorted(Comparator.comparing(Employee::getEmpName)).map(Employee::getEmpName).toList()
		.forEach(System.out::println);
		
		System.out.println("List of employee names in reversed alphabetical order");
		list.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).map(Employee::getEmpName).toList()
		.forEach(System.out::println);
	}
	
	private static void sortEmployeeBasedOnSalary(List<Employee> list) {
		System.out.println("***************** sortEmployeeBasedOnSalary *****************");
		list.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary)).map(Employee::getEmpName).toList()
		.forEach(System.out::println);
		
		System.out.println("List of employee names in reversed salary order");
		list.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).map(Employee::getEmpName).toList()
		.forEach(System.out::println);
		
		System.out.println("List of employee names and salary in reversed salary order");
		list.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).toList()
		.forEach(e -> System.out.println(e.getEmpName()+": "+e.getEmpSalary()));
	}
	
	private static void employeeWithHighestSalary(List<Employee> list) {
		System.out.println("***************** employeeWithHighestSalary *****************");
		Optional<Employee> highestSalaryEmployeeObj = 
				list.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).findFirst();
		if(highestSalaryEmployeeObj.isPresent())
			System.out.println(highestSalaryEmployeeObj.get().getEmpName());
	}
	
	private static void employeeWithSecondHighestSalary(List<Employee> list) {
		System.out.println("***************** employeeWithSecondHighestSalary *****************");
		Optional<Employee> secondHighestSalaryEmployeeObj = 
				list.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).skip(1).findFirst();
		if(secondHighestSalaryEmployeeObj.isPresent())
			System.out.println(secondHighestSalaryEmployeeObj.get().getEmpName());
	}
	
	private static void employeeWithSalaryMoreThan30000(List<Employee> list) {
		System.out.println("***************** employeeWithSalaryMoreThan30000 *****************");
		list.stream().filter(e -> (e.getEmpSalary()>30000)).toList()
		.forEach(e -> System.out.println(e.getEmpName()+": "+e.getEmpSalary()));
	}
	
	private static void employeesInITDepartment(List<Employee> list) {
		System.out.println("***************** employeesInITDepartment *****************");
		list.stream().filter(dep -> ("IT".equalsIgnoreCase(dep.getEmpDepartment()))).toList()
		.forEach(e -> System.out.println(e.getEmpName()+": "+e.getEmpDepartment()));
	}
	
	private static void firstEmployeeFromITDepartment(List<Employee> list) {
		System.out.println("***************** firstEmployeeFromITDepartment *****************");
		String firstEmployeeFromITDepartment =
				list.stream().filter(dep -> ("IT".equalsIgnoreCase(dep.getEmpDepartment()))).toList().get(0).getEmpName();
		System.out.println(firstEmployeeFromITDepartment);
	}
	
	private static void groupEmployeesByDepartmentAndPrintNames(List<Employee> list) {
		System.out.println("***************** groupEmployeesByDepartment *****************");
		Map<String, List<String>> map =
				list.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment, 
				Collectors.mapping(Employee::getEmpName, Collectors.toList())));
		map.forEach((dep, namelist) -> System.out.println(dep+": "+namelist));
	}
	
	private static void countEmployeesInEachDepartment(List<Employee> list) {
		System.out.println("***************** countEmployeesInEachDepartment *****************");
		Map<String, List<Employee>> map =
				list.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment));
		map.forEach((dep, emplist) -> System.out.println(dep+": "+emplist.size()));
	}
	
	private static void employeeWithHighestSalaryInEachDepartment(List<Employee> list) {
		System.out.println("***************** employeeWithHighestSalaryInEachDepartment *****************");
		Map<String, Employee> map = list.stream().collect(Collectors.groupingBy(
				Employee::getEmpDepartment, 
				Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSalary)), Optional::get)));
		map.forEach( (dep, name) -> System.out.println(dep+": "+name.getEmpName()));
	}
	
	private static void sortEmployeesInEachDepartment(List<Employee> list) {
		System.out.println("***************** sortEmployeesInEachDepartment *****************");
				list.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment,
						Collectors.collectingAndThen(Collectors.toList(), 
										li -> li.stream().sorted(Comparator.comparing(Employee::getEmpName))
										.map(Employee::getEmpName)
										.collect(Collectors.toList())) // collectingAndThen ends
										))
				.forEach( (dep, empNameList) -> System.out.println(dep+": "+empNameList));
	}
	
	private static void averageSalary(List<Employee> list) {
		System.out.println("***************** averageSalary *****************");
		double averageSalary = list.stream().collect(Collectors.averagingDouble(Employee::getEmpSalary)).doubleValue();
		System.out.println(averageSalary);
	}
	
	private static void averageSalaryInAdminDepartment(List<Employee> list) {
		System.out.println("***************** averageSalaryInAdminDepartment *****************");
		double averageSalaryInAdminDepartment = list.stream().filter(e -> ("Admin".equalsIgnoreCase(e.getEmpDepartment() )))
													.collect(Collectors.averagingDouble(Employee::getEmpSalary));
		System.out.println(averageSalaryInAdminDepartment);
	}
	
	private static void averageSalaryInEachDepartment(List<Employee> list) {
		System.out.println("***************** averageSalaryInEachDepartment *****************");
		Map<String, Double> map =
		list.stream().collect(Collectors.groupingBy(
				Employee::getEmpDepartment, 
				Collectors.averagingDouble(Employee::getEmpSalary)));
		map.forEach( (dep, avgSal) -> System.out.println(dep+": "+avgSal));
	}
	

}
