package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class Database_conn {
		public static Connection getconn() throws SQLException {
			String url = "jdbc:oracle:thin:@DESKTOP-EITPQDU:1521:XE";
	        String user = "akash";
	        String pass = "akash1234";
	        
	        Connection conn = DriverManager.getConnection(url,user,pass);
	        if (conn != null) {
	            System.out.println("Connected");
	        }
	        return conn;
	    }
	
		public static void main(String args[]) throws SQLException {
			getconn();
		}

	}


