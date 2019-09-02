// 오류
// 1. 에러(Error) : 네트워크 장애, 메모리, 하드웨어 장애.. (코드적으로 해결 불능)
// 2. 예외(Exception) : 개발자의 코드 처리 문제(로직 문제 -> 예측가능)
//							  예외가 발생하면 프로그램 강제적 종료된다.
// 예외처리 가능 : 프로그램을 정상적으로 수정하는 것이 아니고, 문제 발생시 비정상적인 종료를 막는다.
// 정말로 예외 발생 : 코드 수정 해야합니다.
/*
 try {
 	문제가 될 수 있는 코드
 } catch(Exception e) { // e parameter가 문제 원인의 객체를 참조...
 	문제 발생 인지 및 처리
 	ex) 관리자에게 메일을 보낸다, log에 기록한다.
 } finally {
 	문제가 발생하던 하지 않던, 강제적으로 수행되야하는 구문
 	** 강제 함수 종료(return)을 사용해도 실행된다. **
 	ex) DB 연결 닫기
 }
*/

public class Ex01_Exception {
	public static void main(String[] args) {
//		System.out.println("Main Start");
//		System.out.println("Main Logic...");
//		System.out.println(0 / 0);
//		System.out.println("Main End");
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// 자바는 RunTime(실행시) 예외가 발생하면 >> 문제에 해당하는 예외 클래스를 자동 생성한다

		System.out.println("Main Start");
		System.out.println("Main Logic...");
		try {
			System.out.println(0 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");

		System.out.println("Main Start");
		System.out.println("Main Logic...");
		try {
			System.out.println(0 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		finally {
			System.out.println("Main End");
		}
	}
}
