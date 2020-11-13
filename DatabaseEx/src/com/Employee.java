package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("Connected....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void printAllEmployee() {
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from emp");			
			while(rs.next())
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void findEmployeeById() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee ID to find employee ");
		String str=s.next();
		try {
			//Statement stat=con.createStatement();
			//ResultSet rs=stat.executeQuery("select * from emp where eid='"+str+"'");
			PreparedStatement ps=con.prepareStatement("select * from emp where eid=?");
			ps.setString(1, str);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
			else {
				System.out.println("Employee Not Found...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void createEmployee() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee ID ");
		String id=s.next();
		System.out.println("Enter Name");
		String name=s.next();
		System.out.println("Enter Salary");
		int sal=s.nextInt();
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
			ps.setString(1,id);
			ps.setString(2,name);
			ps.setInt(3, sal);
			int rows=ps.executeUpdate();
			if(rows>0)
				System.out.println("Employee Created!!!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}














