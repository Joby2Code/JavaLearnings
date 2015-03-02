package concepts.databases;

import java.sql.*;

public class Util {

	private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/testDB";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connected to the database");
			//con.commit();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		Connection conn = getConnection();
		try {
			//conn.commit();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Unable to load the driver");
			e.printStackTrace();
		}

	}
}
