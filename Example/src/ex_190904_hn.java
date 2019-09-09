import java.util.Scanner;

public class ex_190904_hn {
	public static void main(String[] args) {
		checkStart();
	}

	static void checkStart() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("주민번호를 입력해주세요.");
			String jString = sc.nextLine();
			String[] jAraay = jString.split("-");
			String jumin = genderCheck(jAraay);
			juminNumCheck(jumin);
		}
	}

	static void juminNumCheck(String jumin) {

		switch (jumin.charAt(0)) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		case ' ':
			System.out.println("- 기준 앞 6자리 뒤 7자리를 입력해주세요.");
			break;
		default:
			System.out.println("주민등록번호가 잘못됐습니다.");
			return;
		}
	}

	static String genderCheck(String[] jAraay) {

		for (int i = 0; i < jAraay.length; i++) {
			if ((jAraay[i].length()) != (6 + i)) {
				return jAraay[1] = " ";
			}
		}
		return jAraay[1];
	}
}