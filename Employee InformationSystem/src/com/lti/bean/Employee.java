package com.lti.bean;

public class Employee {
	private String empid;
	private String name;
	private String designation;
	private double basicSalary;
	private double da;
	public Employee() {
		
	}
	public Employee(String empid, String name, String designation, double basicSalary, double da) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.basicSalary = basicSalary;
		this.da = da;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	
	

}
