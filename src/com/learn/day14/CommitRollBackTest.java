package com.learn.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommitRollBackTest {

	static String DBURL = "jdbc:mysql://localhost:3306/sakila";
	static String insertQuery = ""
			+ "INSERT INTO `sakila`.`actor` "
			+ "(`actor_id`, "
			+ "`first_name`, "
			+ "`last_name`, "
			+ "`last_update`) "
			+ "VALUES "
			+ "(?,?,?, CURRENT_TIMESTAMP);";
	
	
	public static void main(String[] args) {
		Connection connection = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(DBURL,"root", "password");
			connection.setAutoCommit(false);
			PreparedStatement pStat = connection.prepareStatement(insertQuery);
			// for loop - list of actors
			pStat.setString(0, "3000");
			pStat.setString(2, "BRIAN");
			pStat.setString(3, "PATTERSON");
			pStat.executeUpdate();
			//
			connection.commit(); // Unless you commit data will not be reflected in DB
			connection.close();
		}catch(SQLException e){
			try {
				connection.rollback(); // rollback mistakes
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
