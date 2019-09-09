import java.util.Scanner;

public class ex_190904 {
	// 주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ...
	// main 함수 Scanner 사용 주민번호 입력받고
	// 앞:6자리 뒷:7자리
	// 입력값 : 123456-1234567
	// 1. 자리수 체크 (기능)함수 (14 ok) >> 다시 입력
	// 2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수 >>
	// 3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수
	// 3개의 함수 static
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println(">> 주민 번호를 입력하세요.");
			String input = scanner.nextLine();
			String gender = checkCount(input);

			if (gender.equals("")) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			if (checkGenderNumber(gender))
				break;
		}
	}

	// 1. 자리수 체크 (기능)함수 (14 ok) >> 다시 입력
	public static String checkCount(String input) {
		String result = "";
		int separator = input.indexOf("-");
		if (separator != -1) {
			String[] strings = input.split("-");
			result = strings[0].length() == 6 && strings[1].length() == 7 ? strings[1].substring(0, 1) : "";
		}

		return result;
	}

	// 3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수
	public static boolean checkGenderNumber(String input) {
		boolean result = true;
		int gender = Integer.parseInt(input);

		if (!checkGenderNumber(gender)) {
			System.out.println("성별이 올바르지 않습니다. 다시 입력하세요.");
			result = false;
		} else {
			switch (gender) {
			case 1:
			case 3:
				System.out.println("남성 입니다.");
				break;
			case 2:
			case 4:
				System.out.println("여성 입니다.");
				break;
			}
		}

		return result;
	}

	// 2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수
	public static boolean checkGenderNumber(int genderNumber) {
		return (genderNumber > 0 && genderNumber < 5) ? true : false;
	}
}
