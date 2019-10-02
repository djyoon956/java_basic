import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.or.bit.utils.ConnectionHelper;
import kr.or.bit.utils.SingletoneHelper;

/*
 현대 >> 파라미터 처리
 String sql = "insert into dememp (empno, ename, deptno) values (?,?,?)";
 ? 파라미터 부분만 바꾸어서
 
 장점 : 보안, 미리 쿼리문 컴파일 -> parameter 설정(가능)
 단점 : 재사용성 떨어짐
 */

public class Ex06_Oracle_Preparestatement {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			connection = SingletoneHelper.getConnection("oracle");
			String sql = "select empno, ename, deptno from emp where deptno = ?";

			// 실행객체를 얻을 때 미리 쿼리문을 보내서 그 객체 정보를 얻는다.
			pstmt = connection.prepareStatement(sql);

			// ? 순서에 따라서 값이 설정된다.
			// parameter 설정
			pstmt.setInt(1, 100);

			rs = pstmt.executeQuery();

			// 데이터가 없는 경우
			// 데이터가 1건인 경우
			// 데이터가 2건 이상인 경우

			if (rs.next()) {
				do {
					System.out.println(rs.getInt(1) + " / " + rs.getString(2) + " / " + rs.getInt(3));
				} while (rs.next());
			} else {
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			ConnectionHelper.close(rs);
			ConnectionHelper.close(pstmt);
		}
	}
}
