package com.lti.service;

import com.lti.bean.Employee;

public class EmployeeService {
	
	public void printEmployeeDetails(Employee emp) {
		double totalSalary=emp.getBasicSalary()+emp.getDa()*30;
		System.out.println(emp.getEmpid()+"\t"+emp.getName()+"\t"+emp.getDesignation()+"\t"+totalSalary);
	}

}
