package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.lti.bean.Employee;

public class EmployeeDao {
	static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("Connected!!!!!!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Employee> getEmployees(){
		List<Employee> listEmployee=new ArrayList<Employee>();
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from Employee");
			while(rs.next()) {
				Employee e=new Employee(rs.getString(1), rs.getString(2), rs.getDouble(3));
				listEmployee.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listEmployee;
	}
	public Employee getEmployee(String empid) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from Employee where eid=?");
			ps.setString(1, empid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				return new Employee(rs.getString(1), rs.getString(2), rs.getDouble(3));
			else
				return null;				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		}
		
	}
	public String createEmployee(Employee emp) {
		String message="";
		try {
			PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?)");
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			int rows=ps.executeUpdate();
			if(rows>0)
				message="Employee Created!!!";
			else
				message="Employee Not Created";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message="Employee Not Created";
		}
		return message;
	}
	public String updateEmployee(Employee emp) {
		try {
			PreparedStatement ps=con.prepareStatement("update employee set name=?, salary=? where eid=?");
			ps.setString(1, emp.getName());
			ps.setDouble(2, emp.getSalary());
			ps.setString(3, emp.getEmpid());
			int rows=ps.executeUpdate();
			if(rows>0) 
				return "Employee Updated!";
			else
				return "Employee Not Updated!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Employee Not Updated!";
		}
		
	}
	public String deleteEmployee(String empid) {
		try {
			PreparedStatement ps=con.prepareStatement("delete from Employee where eid=?");
			ps.setString(1, empid);
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Deleted!!";
			else
				return "Employee Not Deleted";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Employee Not Deleted";
		}
	}
}













