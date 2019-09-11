import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex14_DataInPutStream {
	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			while (true) {
				score = dis.readInt();
				System.out.println("score : " + score);
				sum += score;
			}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
			System.out.println("sum : " + sum);
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
