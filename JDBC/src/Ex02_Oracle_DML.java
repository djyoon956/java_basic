import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
	DML (insert, update, delete)
	
	JDBC 작업
		1. 결과 집합이 없다.(resultSet이 필요하지않다.)
		2. 반영에 대한 결과를 return >> 반영된 행의 갯수

		ex)
		UPDATE EMP SET SAL=0 >> 실반영이 됐다면 >> return 14
		UPDATE EMP SET SAL=100 WHERE EMPNO=999 >> 실반영이 됐다면 >> return 0
		
		POINT
			DB 작업 (insert, update, delete) > 트랜잭션 >> 반드시 commit or rollback을 해야한다.
			
		JDBC API를 통해서 DML 작업 >> default >> auto commit
		java code : delete from emp 실행 >> 실반영 >> 자동 커밋
		필요에 따라 제어가능
			autocommit = false >> 반드시 프로그램에서 commit or rollback
 */
/*
 CREATE TABLE  DEMEMP
AS
  SELECT * FROM EMP WHERE 1=2;
  
ALTER TABLE DEMEMP
ADD CONSTRAINT PK_DEMEMP_EMPNO PRIMARY KEY(EMPNO);

SELECT * FROM DEMEMP;

SELECT * FROM SYS.USER_CONSTRAINTS WHERE TABLE_NAME = 'DEMEMP';
 */
public class Ex02_Oracle_DML {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver"); // memory에 로드 >> new Driver...
			System.out.println("오라클 드라이버 로딩");

			// 1. DB 연결
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bituser", "1004");
			System.out.println("DB 연결 close? : " + connection.isClosed());

			// 2. 명령 생성 (CRUD)
			statement = connection.createStatement(); // 명령에 필요한 객체 얻기

			// 3. 실행 구문
			// String sql = "insert into dememp (empno, ename, deptno) values (100,'홍길동',10)";
			// int resultRow = statement.executeUpdate(sql);
			
			// 3.1 입력 값을 insert
			int empno = 0;
			String ename = "";
			int deptno = 0;

			Scanner scanner = new Scanner(System.in);
			System.out.println("사번 입력");
			empno = Integer.parseInt(scanner.nextLine());
			System.out.println("이름 입력");
			ename = scanner.nextLine();
			System.out.println("부서번호 입력");
			deptno = Integer.parseInt(scanner.nextLine());

			// 고전
			String sql = "insert into dememp (empno, ename, deptno) values ("+empno+",'"+ename+"',"+deptno+")";
			
			// 현대 >> 파라미터 처리
			// String sql = "insert into dememp (empno, ename, deptno) values (?,?,?)";
			
			// 4. 실행
			int resultRow = statement.executeUpdate(sql);
			
			// 5. 처리
			if (resultRow > 0) {
				System.out.println("반영된 행의 갯수 : " + resultRow);
			} else {
				// 의미가 없다.
				// 반영된 행이 없다면, >> insert가 안되엇다면... >> Exception 을 낸다.
				System.out.println("Insert Fail : " + resultRow);
			}
		} catch (Exception e) {
			System.out.println("Insert Fail");
			System.err.println(e.getMessage());

		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
