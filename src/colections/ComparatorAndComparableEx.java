package colections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import functionalinterface.Employee;

public class ComparatorAndComparableEx {

	public static void main(String[] args) {	
		
		List<Integer> list1 = Arrays.asList(12, 15, 10, 14, 13, 11);
		System.out.println(list1);		
		Collections.sort(list1);
		System.out.println(list1);
		
		List<Employee> employeeList = Arrays.asList(new Employee("Kiran", 12345, 400000), new Employee("Ram", 12346, 300000),
				new Employee("Raja", 12347, 100000), new Employee("Mani", 12348, 200000));
		
		System.out.println("---------------------Before Sort------------------------------");
		employeeList.forEach(eachEmp-> System.out.println(eachEmp.getSalary()));
		
		Comparator<Employee> comparaorSort = new Comparator<>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				if(emp1.getSalary() >  emp2.getSalary()) return 0;else return -1 ;
			}
		};
		System.out.println("---------------------After Sort------------------------------");
		Collections.sort(employeeList,comparaorSort);
		employeeList.forEach(eachEmp-> System.out.println(eachEmp.getName()));
		
		Comparator<Employee> comparaorSort2 = (emp1,emp2)->{ if(emp1.getSalary() <  emp2.getSalary()) return 0; else return -1;};
		Collections.sort(employeeList,comparaorSort2);
		employeeList.forEach(eachEmp-> System.out.println(eachEmp.getName()));
		
		Collections.sort(employeeList);
		employeeList.forEach(eachEmp-> System.out.println(eachEmp.getName()));

	}

}
