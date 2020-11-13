package com.lti.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
	String name;
	Integer salary;
	public Employee1(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return name+"\t"+salary;
	}
}
public class MapDemo {

	public static void main(String[] args) {
		
		List<Employee1> li=new ArrayList<Employee1>();
		
		li.add(new Employee1("A", 25000));
		li.add(new Employee1("B", 35000));
		li.add(new Employee1("C", 15000));
		li.add(new Employee1("D", 55000));
		li.add(new Employee1("E", 18000));
		
		/*
		 * for(Employee1 e:li) { if(e.salary>20000) System.out.println(e); }
		 */
		li.stream().filter(e->e.salary>30000).forEach(System.out::println);
	}

}
