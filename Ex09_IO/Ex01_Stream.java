import java.io.*;
import java.util.Arrays;

/*
I/O

1. stream (연결 통로, 입출력 통로, 중간 매개체)
2. stream 크기(1byte) >> 입출력의 기본 단위 >> Byte >> Byte[]
3. 자바 API 제공하는 클래스
	1. 입출력 관련 처리 가능 (만들어진 클래스 사용)
	2. 기본처리 단위 : Byte
	
*추상 클래스
InputStream, OutputStream
두개의 추상 클래스를 상속(재 정의) 클래스..

대상에 따라서 구분한다.
	1. Memory : ByteArrayInput/OutputStream
	2. File : FileInput/OutputStream
	
추가적인 보조 클래스 : File 관련
컴퓨터에서 가장 느린 작업 : Disk read, write
Buffer (I/O 성능 향상)
	BufferedInput/OutStream

*/

public class Ex01_Stream {

	public static void main(String[] args) {
		// (-128 ~127) 정수
		byte[] insrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// System.out.println(insrc[5]);

		byte[] outsrc = null; // outsrc 메모리를 가지고 있지 않다.

		// 데이터를 read, write 대상 배열(memory)
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		input = new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();

		System.out.println("outsrc before : " + Arrays.toString(outsrc));

		int data = 0;
		while ((data = input.read()) != -1) { // 더 이상 read() 없으면 return -1
			// System.out.println(data);
			// System.out.println("input.read() : " + input.read()); // 내부적으로 next() 기능을 가지고
			// 있어 변수에 담아 사용한다.

			output.write(data);
		}

		outsrc = output.toByteArray();
		System.out.println("outsrc after : " + Arrays.toString(outsrc));
	}
}
