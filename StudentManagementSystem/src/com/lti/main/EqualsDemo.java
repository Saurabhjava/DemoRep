package com.lti.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Employee  {
	private String name;
	private Integer salary;
	public Employee(String name, Integer salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	public String toString() {
		return name+"\t"+salary;
	}
}
public class EqualsDemo {	
	
	public static void main(String[] args) {
		 	 
		List<Employee> li=new ArrayList<Employee>();
		li.add(new Employee("Amit",18000));
		li.add(new Employee("Rahul",25000));
		li.add(new Employee("Saurabh",12000));
		li.add(new Employee("Atul",35000));
		li.add(new Employee("Monica",28000));
		
		Comparator<Employee> sortByName=(e,e1)->e.getName().compareTo(e1.getName());
		Comparator<Employee> sortBySalary=(e,e1)->e.getSalary().compareTo(e1.getSalary());
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice to sort by name or salary");
		String ch=s.next();
		if(ch.equals("name"))
			Collections.sort(li,sortByName);
		else
			Collections.sort(li,sortBySalary);
		for(Employee e:li)
			System.out.println(e);
		
	}
}
