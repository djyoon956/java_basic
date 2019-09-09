import java.util.*;

/*
HashMap 활용한 로그인 시스템
*/
public class Ex12_HashMap {
	public static void main(String[] args) {
		// 회원 가입이 되었고, 회원의 Id, Password 관리
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");

		// 시스템에 로그인하는 시나리오
		// Id, Password -> 회원
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Id : ");
			String id = scanner.next().trim().toLowerCase();
			System.out.print("pw :");
			String pw = scanner.next().trim().toLowerCase();

			if (!loginmap.containsKey(id)) {
				System.out.println("아이디가 일치하지 않습니다.");
			} else {
				if (loginmap.get(id).equals(pw)) {
					System.out.println("회원님 방가방가");
					break;
				} else {
					System.out.println("비밀번호 확인하세요.");
				}
			}
		}

	}
}
