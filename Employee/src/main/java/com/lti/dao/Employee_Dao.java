package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lti.entity.Employee;

public class Employee_Dao {
	private Connection conn;
	public Employee_Dao() throws SQLException{
		conn=Database_conn.getconn();
//		Statement stmt=conn.createStatement();  
	}
	public void add_Emp(Employee e) throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement("Insert into Emp (username,password,email) values (?,?,?)");
		ps.setString(1, e.getUsername());
		ps.setString(2, e.getPassword());
		ps.setString(3, e.getEmail());
		ps.executeUpdate();
		System.out.print("Inserted");
		ps.close();
	}
	public void delete_Emp(Employee e) throws SQLException
	{
		PreparedStatement ps1=conn.prepareStatement("Delete from Emp where username=?");
		ps1.setString(1, e.getUsername());
		ps1.executeUpdate();
		System.out.print("Deleted");
		ps1.close();
	}
	public Employee get_data(String name) throws SQLException
	{
		Employee emp= new Employee();
		PreparedStatement ps1=conn.prepareStatement("Select * from Emp where username=?");
		ps1.setString(1, name);
		ResultSet rs = ps1.executeQuery();
		if(rs.next()) {
			emp.setUsername(rs.getString("username"));
			emp.setPassword(rs.getString("password"));		
			emp.setEmail(rs.getString("email"));
		}
		ps1.close();
		return emp;
	}
}
