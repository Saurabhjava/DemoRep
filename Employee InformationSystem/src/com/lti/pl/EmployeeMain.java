package com.lti.pl;

import com.lti.bean.Employee;
import com.lti.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		/*
		 * Employee emp=new Employee(); emp.setEmpid("P101"); emp.setName("Pooja");
		 * emp.setDesignation("Manager"); emp.setBasicSalary(35000); emp.setDa(5000);
		 
		//Employee emp=new Employee("A1001", "Akhil", "Developer", 50000, 2000);
		Employee emp=new Employee();
		emp.setName("Saurabh");
		System.out.println(emp.getEmpid()+"\t"+emp.getName()+"\t"+emp.getDesignation()+"\t"+emp.getBasicSalary()+"\t"+emp.getDa());*/
		
		String empid=args[0];
		EmployeeService es=new EmployeeService();
		Employee emp[]= {new Employee("A1001", "Prashant","Developer", 25000, 2000),new Employee("A1002", "Akhil","Manager", 35000, 2000),
				new Employee("A1003", "Jahnvi","Developer", 45000, 1000), new Employee("A1004", "Pooja","TL", 45000, 2000)};
		boolean b=false;
		for(Employee e:emp) {
			if(empid.equals(e.getEmpid())) {
				es.printEmployeeDetails(e);
				b=true;
				break;
			}
			else {
				b=false;
			}
		}
		
		if(b==false) {
			System.out.println("Employee Not found!!!!");
		}
	}

}
