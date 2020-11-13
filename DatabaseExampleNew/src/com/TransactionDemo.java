package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			con.setAutoCommit(false);
			PreparedStatement ps1=con.prepareStatement("insert into X values(?,?)");
			PreparedStatement ps2=con.prepareStatement("insert into Y values(?,?)");
			ps1.setString(1, "1003");
			ps1.setString(2, "Rahul");
			
			ps2.setString(1, "1003");
			ps2.setString(2, "Rahul");
			
			ps1.executeUpdate();
			ps2.executeUpdate();
				
			System.out.println("Updated........");
			con.commit();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
