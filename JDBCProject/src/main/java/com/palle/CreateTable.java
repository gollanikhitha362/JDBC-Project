package com.palle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			//Step1: load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2: establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject", "root", "nikhitha@333");
			//step3: prepare sql statement
			Statement st = con.createStatement();
			//step4: execute query
			st.executeUpdate("create table student(id int primary key, name varchar(50), course varchar(40))");
			//step5: close connection
			st.close();
			con.close();
			System.out.println("Table is created successfully!, check in Db");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
