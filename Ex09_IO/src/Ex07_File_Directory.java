import java.io.File;

/*
File 클래스
	- a.txt 생성, 수정, 삭제, 정보 read 가능
	- Temp 폴더 생성, 삭제, 정보 read 가능

절대경로 : full path
상대경로 : 현재 파일 중심
	
*/
public class Ex07_File_Directory {
	public static void main(String[] args) {
		String path = "C:\\SmartWeb\\IOTemp\\file.txt";
		File f = new File(path);
		// f.createNewFile(); 파일 생성 기능

		System.out.println("파일명 : " + f.getName());
		System.out.println("전체 경로 : " + f.getPath());
		System.out.println("절대 경로 : " + f.getAbsolutePath());
		System.out.println("isDirectory : " + f.isDirectory());
		System.out.println("isFile : " + f.isFile());
		System.out.println("크기 : " + f.length());
		System.out.println("부모 경로 : " + f.getParent());
		System.out.println("exists : " + f.exists());
		System.out.println("canRead : " + f.canRead());
		System.out.println("canWrite : " + f.canWrite());
	}
}
