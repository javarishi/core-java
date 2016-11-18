package com.learn.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Properties;



public class TestJDBC {
	
	static String DBURL = "jdbc:mysql://localhost:3306/sakila";
	static String sqlStatement = ""
			+ "SELECT `actor`.`actor_id`, "
			+ "    `actor`.`first_name`, "
			+ "    `actor`.`last_name`, "
			+ "    `actor`.`last_update` "
			+ "FROM `sakila`.`actor`;";

	public static void main(String[] args) {
		try {
				// 1. Load Driver in Heap Memory
				// A. Register Driver
				//	Driver driver = new Driver();
				//	DriverManager.registerDriver(driver);
				//	System.out.println(" Register Driver with DriverManager.registerDriver");
				
				// B. Use reflection method
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println(" Register Driver with Class.forName");

				// 2. Driver Manager gets connection using credentials
				Properties prop = new Properties();
				prop.put("user", "root");
				prop.put("password", "password");
				Connection connection = DriverManager.getConnection(DBURL,prop);
				System.out.println(" Connection Established ");
				
				// Using statements
				Statement stmt = connection.createStatement();
				ResultSet  rs = stmt.executeQuery(sqlStatement);
				int actorId = 0;
				String firstName = null;
				String lastName = null;
				Timestamp ts = null;
				if(rs != null){
					while(rs.next()){
						actorId = rs.getInt("actor_id");
						firstName = rs.getString("first_name");
						lastName = rs.getString("last_name");
						ts = rs.getTimestamp("last_update");
						System.out.println( actorId + " " + firstName + " " + lastName + " " + ts);
					}
				}
				
				
				
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
