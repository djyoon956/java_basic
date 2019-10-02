import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.or.bit.utils.SingletoneHelper;

public class Ex07_Oracle_PrepareStatement_dml {
	public static void main(String[] args) {
		Connection connection = null;

		try {
			connection = SingletoneHelper.getConnection("oracle");
			// insert(connection);
			// update(connection);
			delete(connection);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void insert(Connection connection) {
		PreparedStatement pstm = null;
		try {
			String sql = "insert into dememp(empno, ename, sal, deptno) values (?,?,?,?)";
			pstm = connection.prepareStatement(sql);

			pstm.setInt(1, 9999);
			pstm.setString(2, "ename99");
			pstm.setInt(3, 1000);
			pstm.setInt(4, 10);

			int row = pstm.executeUpdate(); // insert, update, delete

			if (row > 0) {
				System.out.println("insert row count : " + row);
			} else {
				System.out.println("FAIL");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void update(Connection connection) {
		PreparedStatement pstm = null;
		try {
			String sql = "update dememp set ename=?, sal=? where deptno=?";
			pstm = connection.prepareStatement(sql);

			pstm.setString(1, "ename");
			pstm.setInt(2, 999);
			pstm.setInt(3, 10);

			int row = pstm.executeUpdate(); // insert, update, delete

			if (row > 0) {
				System.out.println("update row count : " + row);
			} else {
				System.out.println("FAIL");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void delete(Connection connection) {
		PreparedStatement pstm = null;
		try {
			String sql = "delete from dememp where ename=? or sal=?";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, "BLAKE");
			pstm.setInt(2, 1500);

			int row = pstm.executeUpdate(); // insert, update, delete

			if (row > 0) {
				System.out.println("delete row count : " + row);
			} else {
				System.out.println("FAIL");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
