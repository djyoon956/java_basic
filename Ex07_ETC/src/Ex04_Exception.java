import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import kr.or.bit.ExceptionClass;

// throws : class 설계시 내가 가지고 있는 자원을 사용하는 개발자에게 강제로 예외처리하도록 하는 방법
//				ex) throws ArithmeticException, IndexOutOfBoundsException
//				생성자 뒤에
//				함수 뒤에

public class Ex04_Exception {
	public static void main(String[] args) {
		ExceptionClass ec;

		try {
			ec = new ExceptionClass("Hello");
			ec.call();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// JAVA API 에서 제공하는
		try {
			FileInputStream f1 = new FileInputStream("c:\\temp\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
