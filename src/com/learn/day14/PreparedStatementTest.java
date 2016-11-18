package com.learn.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class PreparedStatementTest {

	static String DBURL = "jdbc:mysql://localhost:3306/sakila";
	static String selectQuery =  ""
			+ "SELECT `actor`.`actor_id`, "
			+ "    `actor`.`first_name`, "
			+ "    `actor`.`last_name`, "
			+ "    `actor`.`last_update` "
			+ "FROM `sakila`.`actor` "
			+ "WHERE `actor`.`actor_id` > ? "
			+ "AND `actor`.`first_name` like ?";
	
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(DBURL,"root", "password");
			PreparedStatement pStat = connection.prepareStatement(selectQuery);
			pStat.setInt(1, 10);
			pStat.setString(2, args[0]);
			ResultSet rs = pStat.executeQuery();
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
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
