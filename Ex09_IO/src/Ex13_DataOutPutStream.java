import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
보조 스트림

DataInput/OutPutStream
Java 8가지 기본 타입 지원
	- 타입 별로 write, read 가능하다.

*/
public class Ex13_DataOutPutStream {
	public static void main(String[] args) {
		int[] scores = { 100, 60, 55, 94, 23 };
		try {
			FileOutputStream fos = new FileOutputStream("score.txt");
			DataOutputStream dos = new DataOutputStream(fos);

			for (int i = 0; i < scores.length; i++) {
				dos.writeInt(scores[i]);// 정수값 write >> read시 반드시 DataInputPutStream 사용
			}
			dos.close();
			fos.close();
		} catch (Exception e) {

		}
	}
}
