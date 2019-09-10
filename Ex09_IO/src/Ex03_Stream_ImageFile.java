import java.io.*;

public class Ex03_Stream_ImageFile {
	public static void main(String[] args) throws Exception {
		String path = "C:\\SmartWeb\\IOTemp\\1.jpg";
		String targetPath = "copy.jpg";

		FileInputStream stream = new FileInputStream(path);
		FileOutputStream outputStream = new FileOutputStream(targetPath);

		int data = 0;
		while ((data = stream.read()) != -1) {
			outputStream.write(data);
		}

		stream.close();
		outputStream.close();
		System.out.println("작업 완료");
	}
}
