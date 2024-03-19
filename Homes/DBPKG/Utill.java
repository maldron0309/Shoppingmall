package DBPKG;

import java.sql.*;

public class Utill {
	public static Connection getConnection() throw Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "system", "1234");
		return con;
	}

}
