import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
char[]
한글 1자 : 2 byte
	- Stream x

Reader , Writer (추상클래스)

*/

public class Ex05_Reader_Writer_kor {
	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;

		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Ex01.txt");

			int data = 0;
			while ((data = fr.read()) != -1) {
				fw.write(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				fw.close();
				fr.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
