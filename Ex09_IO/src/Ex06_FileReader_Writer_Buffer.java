import java.io.BufferedReader;
import java.io.FileReader;

/*
Reader, Writer 작업시 Buffer 이용하여 성능 향상
Buffer 장점 : Line 단위로 read, write  할 수있다.
*/
public class Ex06_FileReader_Writer_Buffer {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);

			String line = "";
			for (int i = 0; (line = br.readLine()) != null; i++) {

				if (line.indexOf(";") != -1) {
					System.out.println(line);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
