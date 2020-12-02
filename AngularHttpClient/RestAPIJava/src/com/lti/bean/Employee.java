package com.lti.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private String empid;
	private String name;
	private double salary;
	public Employee() {		
	}
	public Employee(String empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
