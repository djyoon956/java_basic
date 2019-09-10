import java.io.*;
import java.nio.file.Path;

/*
FileInput/OutputStream

txt 기반 작업 : C:\\\SmartWeb\IOTemp\a.txt
*/
public class Ex02_POINT_File_read_write {
	public static void main(String[] args) {
		// IO 작업은 대부분 가비지 컬렉터의 대상이 아니다.
		// 명시적인 자원의 해제 작업을 해야한다. (close() >> 내부적으로 소멸자 호출)

//		try {
//			FileInputStream fs = new FileInputStream("C:\\SmartWeb\\IOTemp\\a.txt");
//			FileOutputStream fo = new FileOutputStream("C:\\SmartWeb\\IOTemp\\b.txt");
//			int data = 0;
//			while ((data = fs.read()) != -1) {
//				System.out.println("정수 (아스키 코드) : " + data);
//				char c = (char) data;
//				System.out.println("char : " + c);
//				fo.write(c);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			fs.close();
//		}

		FileInputStream fs = null;
		FileOutputStream fo = null;
		String path = "C:\\SmartWeb\\IOTemp\\a.txt";

		try {
			fs = new FileInputStream(path);
			// 기본값 덮어쓰기 (overwrite)
			// fo = new FileOutputStream("C:\\SmartWeb\\IOTemp\\new.txt", *true*); 이어쓰기
			fo = new FileOutputStream("C:\\SmartWeb\\IOTemp\\new.txt", true);
			int data = 0;
			while ((data = fs.read()) != -1) {
				fo.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
