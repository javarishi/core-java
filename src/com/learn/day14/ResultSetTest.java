package com.learn.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.sql.Timestamp;

public class ResultSetTest {
	
	static String DBURL = "jdbc:mysql://localhost:3306/sakila";
	static String selectQuery =  ""
			+ "SELECT `actor`.`actor_id`, "
			+ "    `actor`.`first_name`, "
			+ "    `actor`.`last_name`, "
			+ "    `actor`.`last_update` "
			+ "FROM `sakila`.`actor` ;";

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(DBURL,"root", "password");
			PreparedStatement pStat = connection.prepareStatement(selectQuery, 
						ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = pStat.executeQuery();
			int actorId = 0;
			String firstName = null;
			String lastName = null;
			Timestamp ts = null;
			if(rs != null){
				rs.first();
				//rs.last();
				actorId = rs.getInt("actor_id");
				firstName = rs.getString("first_name");
				lastName = rs.getString("last_name");
				ts = rs.getTimestamp("last_update");
				System.out.println( actorId + " " + firstName + " " + lastName + " " + ts);
				
				
				rs.absolute(2);
				actorId = rs.getInt("actor_id");
				firstName = rs.getString("first_name");
				lastName = rs.getString("last_name");
				ts = rs.getTimestamp("last_update");
				System.out.println( actorId + " " + firstName + " " + lastName + " " + ts);
				
				rs.relative(3);
				actorId = rs.getInt("actor_id");
				firstName = rs.getString("first_name");
				lastName = rs.getString("last_name");
				ts = rs.getTimestamp("last_update");
				System.out.println( actorId + " " + firstName + " " + lastName + " " + ts);
				
				rs.last();
				actorId = rs.getInt("actor_id");
				firstName = rs.getString("first_name");
				lastName = rs.getString("last_name");
				ts = rs.getTimestamp("last_update");
				System.out.println( actorId + " " + firstName + " " + lastName + " " + ts);
				
				rs.previous();
				actorId = rs.getInt("actor_id");
				rs.updateString("first_name", "NICK");
				lastName = rs.getString("last_name");
				ts = rs.getTimestamp("last_update");
				rs.updateRow(); // FirstName gets Updated in DB
				System.out.println( actorId + " " + firstName + " " + lastName + " " + ts);
				
				rs.absolute(199);
				actorId = rs.getInt("actor_id");
				firstName = rs.getString("first_name");
				lastName = rs.getString("last_name");
				ts = rs.getTimestamp("last_update");
				
				System.out.println( actorId + " " + firstName + " " + lastName + " " + ts);
			
				rs.moveToInsertRow();
				rs.updateInt("actor_id", 201);
				rs.updateString("first_name", "SOME");
				rs.updateString("last_name", "NAME");
				rs.updateTimestamp("last_update", new Timestamp(System.currentTimeMillis()));
				
				rs.insertRow();
				
				System.out.println("Current Row " + rs.getRow());
				
				
				
				/*while(rs.next()){
					actorId = rs.getInt("actor_id");
					firstName = rs.getString("first_name");
					lastName = rs.getString("last_name");
					ts = rs.getTimestamp("last_update");
					System.out.println( actorId + " " + firstName + " " + lastName + " " + ts);
				}*/
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
