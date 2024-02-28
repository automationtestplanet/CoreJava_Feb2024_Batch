package colections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import functionalinterface.Employee;

public class UseStreams {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 11, 12, 13, 14, 15);
		List<Integer> evenList = new ArrayList<>();
		for (int eachVal : list1) {
			if (eachVal % 2 == 0)
				evenList.add(eachVal);
		}

		System.out.println(evenList);

		list1.stream().filter(eachVal -> {
			if (eachVal % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(eachval -> System.out.println(eachval));
		List<Integer> evenList1 = list1.stream().filter(eachVal -> {
			if (eachVal % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).collect(Collectors.toList());
		System.out.println(evenList1);

		List<Integer> evenList2 = list1.stream().filter(eachVal -> eachVal % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList2);

		List<Employee> employeeList = Arrays.asList(new Employee("Kiran", 12345, 100000), new Employee("Ram", 12346, 200000),
				new Employee("Raja", 12347, 300000), new Employee("Mai", 12348, 400000));
		
		employeeList.stream().filter(empObj -> empObj.getName().equalsIgnoreCase("Kiran")).collect(Collectors.toList()).get(0).displayEmployDetails();
		
		employeeList.stream().filter(empObj -> empObj.getName().startsWith("R")).collect(Collectors.toList()).forEach(eachEmp -> eachEmp.displayEmployDetails());
		
		employeeList.stream().filter(empObj -> empObj.getSalary()==400000).collect(Collectors.toList()).forEach(eachEmp -> eachEmp.displayEmployDetails());
		
		System.out.println(list1.stream().reduce(0,(val1,val2)-> val1+val2)); 
	
		employeeList.stream().map(emp1->emp1.getSalary()+5).forEach(emp1->System.out.println(emp1));
		
		System.out.println(employeeList.stream().map(emp1->emp1.getSalary()).reduce(0L,(val1,val2)->val1+val2));	
		
		list1.stream().map(emp1->emp1+5).forEach(emp1->System.out.println(emp1));
		
		long sumOfSal = employeeList.stream()
		.filter(eachEmp -> eachEmp.getName().startsWith("R"))
		.map(eachEmp-> eachEmp.getSalary())
		.reduce(0L,(val1,val2)->val1+val2);		
		System.out.println(sumOfSal);
		
		employeeList.stream().map(emp1->emp1.getSalary()+5).forEach(System.out::println);
		
		employeeList.stream().map(emp1->emp1.getName()).map(String::toUpperCase).forEach(System.out::println);
		
		
		
		var var1 = employeeList.stream()
		.filter(eachEmp -> eachEmp.getName().startsWith("R"))
		.map(eachEmp-> eachEmp.getSalary())
		.reduce(0L,(val1,val2)->val1+val2);
		
		System.out.println(var1);
		
		
		var evenList3 = list1.stream().filter(eachVal -> eachVal % 2 == 0).collect(Collectors.toList());
		
		var emp = employeeList.stream().filter(empObj -> empObj.getSalary()==400000);
		emp.forEach(System.out::println);
//		emp.forEach(eachEmp -> eachEmp.getName());
		
	}

}
