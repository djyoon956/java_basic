import java.io.IOException;

public class Ex03_Exception_finally {

	static void startInstall() {
		System.out.println("INSTALL");
	}

	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	
	static void deleteFiles() {
		System.out.println("DELETE FILES");
	}
	public static void main(String[] args) {
		/*
		  try {
		  
		  } catch(Exception e){
		  		예외가 발생되면 실행
		  } 
		  finally {
		  		예외가 발생하던... 발생하지 않던 강제적으로 싱행되는 구문
		  		[강제적]으로 [실행되는 구문]
		  }
		 */

		try {
			copyFiles();
			startInstall();

			// 임의로 예외 발생시킴
			throw new IOException("!! Install 중 문제 발생 !!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { // 예외가 발생하던 발생하지 않던, **강제적**으로 실행되는 블럭
			// ***주의 사항***
			// 함수의 강제 종료 (return;)하더라도 finally 블럭 구문은 무조건 실행된다.
			// 주 사용) IO 자원 해제(close()), DB연결 해제

			deleteFiles();
		}

		System.out.println("Main End");
	}
}
