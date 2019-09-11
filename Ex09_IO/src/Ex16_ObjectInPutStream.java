
import java.io.*;

import kr.or.bit.UserInfo;

public class Ex16_ObjectInPutStream {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		ObjectInputStream input = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("UserData.txt"));
			input = new ObjectInputStream(bis);

			// 역 직렬화
//			UserInfo r1 = (UserInfo) input.readObject();
//			UserInfo r2 = (UserInfo) input.readObject();

			Object users = null;
			while ((users = input.readObject()) != null) {
				System.out.println(users.toString());
			}
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
