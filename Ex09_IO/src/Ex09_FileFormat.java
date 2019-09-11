import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.type.DeclaredType;

public class Ex09_FileFormat {
	public static void main(String[] args) {
//		DecimalFormat df = new DecimalFormat("#,###.0");
//		System.out.println(df.format(1234567.89));
//		System.out.println(df.format(1000000000));
//
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		System.out.println(sf.format(new Date()));
//
//		String phone = "^01[0-1]?[6-9]-/d{4}-/d{4}$";

		File dir = new File("C:\\SmartWeb\\IOTemp");
		File[] files = dir.listFiles(); // IOTemp 하위에 dir,file 목록 추출

		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mma");

			String attribute = "";
			String size = "";

			if (file.isDirectory()) {
				attribute = "<DIR>";
			} else {
				size = file.length() + "byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			}

			System.out.printf("%s\t%3s\t%10s\t%s\n", format.format(new Date(file.lastModified())), attribute, size, name);
		}
	}
}
