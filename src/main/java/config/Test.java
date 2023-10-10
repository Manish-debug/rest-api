package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
		    final String DB_URL = "jdbc:mysql://localhost:3306/stdb";


		    final String USER = "root";
		    final String PASS = "root"; 

		  Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		  System.out.println("conn : "+conn);
		  String query = "SELECT * FROM employee";
	      Statement st = conn.createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        int id = rs.getInt("empId");
	        String firstName = rs.getString("Name");
	        
	        // print the results
	        System.out.format("%s, %s\n", id, firstName);
	      }
	      st.close();

	}

}
