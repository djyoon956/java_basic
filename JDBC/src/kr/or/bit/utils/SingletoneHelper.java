package kr.or.bit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletoneHelper {
	private static Connection connection;

	private SingletoneHelper() { }

	public static Connection getConnection(String dsn) { // oracle, mysql
		try {
			if (connection != null)
				return connection;

			if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver"); // memory에 로드 >> new Driver...
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bituser", "1004");
			} else if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver"); // memory에 로드 >> new Driver...
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bitsqldb?useSSL=true", "bituser",
						"1004");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return connection;
	}

	public static void close() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
