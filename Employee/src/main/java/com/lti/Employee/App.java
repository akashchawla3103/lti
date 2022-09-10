package com.lti.Employee;

import java.sql.SQLException;

import com.lti.dao.Employee_Dao;
import com.lti.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!");
        
        Employee_Dao emp=new Employee_Dao();
        Employee e1=new Employee();
        e1.setUsername("mukesh");
//        e1.setPassword("Akash@1234");
//        e1.setEmail("akash3103@sql.com");
//        emp.add_Emp(e1);
        
//        emp.delete_Emp("admin");
        Employee e11=emp.get_data("Mukesh");
//        emp.delete_Emp(e1);
        System.out.print(e11.getUsername());
    }
}
