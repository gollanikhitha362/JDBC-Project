package com.palle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject", "root", "nikhitha@333");
			
			PreparedStatement st = con.prepareStatement("insert into student values(?, ?, ?)");
			st.setInt(1, 103);
			st.setString(2, "Raji");
			st.setString(3, "Sql");
			
			int noOfRows = st.executeUpdate();
			System.out.println("No.of rows inserted "+noOfRows);
			
			st.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
