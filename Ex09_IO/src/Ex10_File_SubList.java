import java.io.*;
import java.util.ArrayList;

public class Ex10_File_SubList {
	static int totalFiles = 0;
	static int totalDirs = 0;

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("사용법 : java [실행 파일 명] [경로명]");
			System.out.println("ex : java Ex10_File_SubList C:\\temp");
			System.exit(0);
		}

		File f = new File(args[0]);
		if (!(f.exists() || f.isDirectory())) {
			System.out.println("유효하지 않은 Directory 입니다.");
			System.exit(0);
		}

		// 정상경로...
		printFileList(f);

		System.out.println("누적 총 파일 수 : " + totalFiles);
		System.out.println("누적 총 폴더 수 : " + totalDirs);
	}

	static void printFileList(File dir) {
		System.out.println("[Full Path : " + dir.getAbsolutePath() + "]");

		ArrayList<Integer> subDirs = new ArrayList<>();
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName(); // 파일/디렉터리 명
			if (files[i].isDirectory()) {
				fileName = "<Dir> [" + fileName + "]";
				subDirs.add(i);
			} else {
				fileName = fileName + "/" + files[i].getAbsolutePath() + "Byte";
			}
			System.out.println(" " + fileName);
		}

		int dirNum = subDirs.size(); // directory count
		int fileNum = files.length - dirNum; // file count

		totalDirs += dirNum; // 누적 directory count
		totalFiles += fileNum; // 누적 file count

		System.out.println("[Current driNum] : " + dirNum);
		System.out.println("[Current fileNum] : " + fileNum);
		System.out.println("******************************");

		// Point
		for (int i = 0; i < subDirs.size(); i++) {
			int index = subDirs.get(i);
			printFileList(files[index]);
		}
	}
}
