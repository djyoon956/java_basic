import java.sql.Connection;
import java.sql.SQLException;

import kr.or.bit.utils.ConnectionHelper;
import kr.or.bit.utils.SingletoneHelper;

public class Ex05_ConnectionHelper {

	public static void main(String[] args) throws SQLException {
//		Connection connection = null;
//		connection = ConnectionHelper.getConnection("oracle");
//
//		System.out.println(connection.toString());
//		System.out.println(connection.getMetaData().getDatabaseProductName());
//		System.out.println(connection.getMetaData().getDatabaseProductVersion());
//		System.out.println("연결(close) 여부 : " + connection.isClosed());
//
//		ConnectionHelper.close(connection);
//		System.out.println("연결(close) 여부 : " + connection.isClosed());
//		
//		System.out.println("**************************************");
//		Connection connection2 = null;
//		connection2 = ConnectionHelper.getConnection("oracle","hr","1004");
//
//		System.out.println(connection2.toString());
//		System.out.println(connection2.getMetaData().getDatabaseProductName());
//		System.out.println(connection2.getMetaData().getDatabaseProductVersion());
//		System.out.println("연결(close) 여부 : " + connection2.isClosed());
//
//		ConnectionHelper.close(connection2);
//		System.out.println("연결(close) 여부 : " + connection2.isClosed());
//		
		// 1. 연결 객체 주소 : oracle.jdbc.driver.T4CConnection@4629104a
		// 2. 연결 객체 주소 : oracle.jdbc.driver.T4CConnection@7fac631b
		// 하나의 app 연결 할 때마다 객체를 생성하고 그 것을 사용하는 게 맞을까?
		// 자바 -> Singletone

		Connection connection3 = null;
		connection3 = SingletoneHelper.getConnection("oracle");

		System.out.println(connection3.toString());
		System.out.println(connection3.getMetaData().getDatabaseProductName());
		System.out.println(connection3.getMetaData().getDatabaseProductVersion());
		System.out.println("연결(close) 여부 : " + connection3.isClosed());

		ConnectionHelper.close(connection3);
		System.out.println("연결(close) 여부 : " + connection3.isClosed());

		Connection connection4 = null;
		connection4 = SingletoneHelper.getConnection("oracle");

		System.out.println(connection4.toString());
		System.out.println(connection4.getMetaData().getDatabaseProductName());
		System.out.println(connection4.getMetaData().getDatabaseProductVersion());
		System.out.println("연결(close) 여부 : " + connection4.isClosed());

		ConnectionHelper.close(connection4);
		System.out.println("연결(close) 여부 : " + connection4.isClosed());
	}
}
