package com.lti.Employee;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import com.lti.dao.Database_conn;
import com.lti.dao.Employee_Dao;
import com.lti.entity.Employee;

public class Employee_Test {
	private static Employee e;
		@Test
		public void testconn() throws SQLException
		{
			Connection conn= Database_conn.getconn();
			assertNotNull(conn,"Connection sucessful");
		}
		
		@Test
		public void addEmployeeTest() throws SQLException 
		{
			e=new Employee();
			e.setUsername("mukesh");
			e.setPassword("mukesh@1234");
			e.setEmail("mukesh@sql.com");
			Connection conn= Database_conn.getconn();
			Employee_Dao a=new Employee_Dao();
			a.add_Emp(e);
			assertEquals("mukesh@1234",e.getPassword());
			
		}
		@Test
		public void deleteEmployeeTest() throws SQLException
		{
			Connection conn= Database_conn.getconn();
			Employee_Dao a=new Employee_Dao();
			
			a.delete_Emp(e);
			Employee temp=a.get_data(e.getUsername());
			System.out.println(temp.getUsername());
			assertNull(temp.getUsername());
			
//			assertEquals("mukesh@1234",e.getPassword());
		}
	
	
	

}
