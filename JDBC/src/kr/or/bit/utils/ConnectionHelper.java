package kr.or.bit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 Class.forName("oracle.jdbc.OracleDriver"); // memory에 로드 >> new Driver...
 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bituser", "1004");

 모든 CRUD 선행 작업시 위 코드 필수
 
 1. 반복적인 작업을 줄이자
 	드라이버 로딩
 	연결 객체
 	명령 객체
 	자원 해제...
 
 2. 다른 계정이나 다른 DB를 연결 고민
 
 */

public class ConnectionHelper {
	// 기능 (연결...) >> 함수 >> static

	public static Connection getConnection(String dsn) { // oracle, mysql
		Connection connection = null;
		try {
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

	public static Connection getConnection(String dsn, String id, String pw) { // oracle, mysql
		Connection connection = null;
		try {
			if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver"); // memory에 로드 >> new Driver...
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", id, pw);
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

	public static void close(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void close(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void close(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void close(PreparedStatement preparedStatement) {
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
