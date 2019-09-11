import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_Finder {
	String baseDir = "C:\\SmartWeb\\IOTemp"; // 타겟 폴더
	String word = "HELLO"; // 검색 단어
	String save = "result.txt"; // 검색 단어가 들어있는 파일 명 출력

	void Find() throws IOException {
		File dir = new File(baseDir);
		if (!dir.isDirectory()) {
			System.out.println("baseDir is not directory");
			System.exit(0);
		}

		PrintWriter pw = new PrintWriter(new FileWriter(save));
		BufferedReader br = null;

		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			if (!file.isFile())
				continue; // 아래 코드 skip

			// 파일이라면
			br = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.indexOf(word) != -1)
					pw.println("word = " + file.getAbsolutePath());
			}
			pw.flush();
		}
		br.close();
		pw.close();
	}

	public static void main(String[] args) {
		Ex12_PrintWriter_String_Finder ex = new Ex12_PrintWriter_String_Finder();
		try {
			ex.Find();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
