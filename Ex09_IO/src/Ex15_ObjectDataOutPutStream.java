import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

// 객체를 파일에 write
public class Ex15_ObjectDataOutPutStream {
	public static void main(String[] args) {
		String filename = "UserData.txt";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(filename, true);
			bos = new BufferedOutputStream(fos);

			// 직렬화
			ObjectOutputStream out = new ObjectOutputStream(bos);
			UserInfo user1 = new UserInfo("superman", "super", 500);
			UserInfo user2 = new UserInfo("scott", "tiger", 50);
			out.writeObject(user1);
			out.writeObject(user2);
			System.out.println("파일 생성-> buffer -> 직렬화 -> write");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
