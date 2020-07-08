package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LearningJDBC {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    refers to my GCP instance
//    static final String DB_URL = "jdbc:mysql://35.234.143.115/practice";
//    Local host on my machine
	static final String DB_URL = "jdbc:mysql://localhost:3306/practice";

////  static final String DB_URL = "jdbc:mysql://localhost:3306/practice";
//
//    // Database credentials
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			String sql;

			sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				String first = rs.getString("name");
				String email = rs.getString("email");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(" -- Name: " + first);
				System.out.println(" -- Email: " + email);

			}

			// SIDE STEP: Adding data to table

//			stmt.executeUpdate("INSERT INTO user (name, email) VALUES ('Simpson1', 'Springfield@hotmail.com')");
//			stmt.executeUpdate("INSERT INTO user (name, email) VALUES ('Simpson2', 'Springfield@hotmail.com')");
			// SIDE STEP: DELETING data from table

			stmt.executeUpdate("UPDATE user SET email = 'ahmadnew@hotmail.com' WHERE name = 'Ahmad Naeem'");

			sql = "SELECT * FROM user";
			rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				String first = rs.getString("name");
				String email = rs.getString("email");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(" -- Name: " + first);
				System.out.println(" -- Email: " + email);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
//         finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}
// end FirstExample
