import java.io.*;

/*
출력 형식 정의
printf, String.format
*/

public class Ex11_PrintWriter {
	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("C:\\SmartWeb\\IOTemp\\homework.txt");
			pw.println("**************");
			pw.println("*   HOMEWORK   *");
			pw.println("**************");
			pw.format("%3s : %5d %5d %5d %5.1f", "아무개", 100, 90, 50, (float) ((100 + 90 + 50) / 3));
			pw.close();

			// homework.txt read(라인 별로)
			BufferedReader buffer = new BufferedReader(new FileReader("C:\\SmartWeb\\IOTemp\\homework.txt"));

			String line = "";
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

		}
	}
}
