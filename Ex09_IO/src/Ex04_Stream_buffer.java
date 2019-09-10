import java.io.*;

/*

File에 Disk(read, write)..작업이 느리다
한 byte씩 read, write하지말고 모아서 처리한다.
모으는 작업 : buffer 이용 >> cash memory
File을 통해서 read, write 할때 중간에 buffer을 통해 I/O 성능개선


1. I/O 성능 개선
2. Line 단위 처리 가능

I/O 보조 스트림 
	>> InputStream 상속해서 구현하는 객체에 의존하기 때문에 보조 스트림이다.
BufferedInputStream
BufferedOutputStream

*/

public class Ex04_Stream_buffer {
	public static void main(String[] args) {
		FileOutputStream fo = null;
		BufferedOutputStream bo = null;

		try {
			fo = new FileOutputStream("data.txt");
			bo = new BufferedOutputStream(fo);

			for (int i = 0; i < 10; i++) {
				bo.write('A');
			}

			/*
			 * Java buffer 크기 : 8k byte => 8192byte >> WEB 
			 * 1. buffer 안의 내용이 8k byte를 다 채우면 자동으로 비운다. 
			 * 2. buffer 강제로 비우기 : flush() 함수 강제 호출
			 * 3. bo.close() 함수를 호출 하면 내부에서 flush()를 호출 한다.
			 */
			// bo.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bo.close();
				fo.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
