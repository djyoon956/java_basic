import java.io.File;

public class Ex08_File_Directory {
	public static void main(String[] args) {
		// System.out.println(Arrays.toString(args));
		// System.out.println(args[0]);
		if (args.length != 1) {
			System.out.println("사용법 : java 파일명 argument");
			System.exit(0);
		}

		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 경로입니다.");
			System.exit(0);
		}
		File[] files = f.listFiles();
		for (int i = 0; i < files.length; i++)
			System.out.println((files[i].isDirectory() ? "Dir" : "File") + " : " + files[i].getName());
	}
}
