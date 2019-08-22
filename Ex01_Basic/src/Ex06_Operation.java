// import java.lang.Math;

public class Ex06_Operation {
	public static void main(String[] args) {
		int sum = 0;
		// 대입연산자 (+= , -= , *=, ) 습관적으로
		sum += 1; // sum=sum+1
		sum -= 1; // sum=sum-1;
		System.out.println("sum:" + sum);

		// 간단한 학점계산기
		// 학점 ... A+, A-, B+, B- (Score)
		// 점수 : 94점
		// 95점 이상 A+
		// 그 외는 A-
		// 90점 이상이면 A 인데 ... 95 A+, 93 A-
		int score = 55;
		String grade = ""; // 문자열 초기화
		System.out.println("당신의 점수는? :" + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("그러므로 당신의 학점은? :" + grade);

		// sysout+ctrl+space = system.out.println
		// 코드 정렬하기 = ctrl+A 블럭선택 > ctrl+shift+f
		int data = 55;
		switch (data) {
		case 100:
			System.out.println("100입니다");
			break;
		case 90:
			System.out.println("90입니다");
			break;
		case 80:
			System.out.println("80입니다");
			break;
		default:
			System.out.println("default");

		}

		// break는 강제 사항이 아닙니다. (필요에 따라서 쓰면 된다.)
		// Case 조건 만족하는 이후부터 ~ break까지 출력한다.
		data = 80;
		switch (data) {
		case 100:
			System.out.println("100입니다");
		case 90:
			System.out.println("90입니다");
		case 80:
			System.out.println("80입니다");
		default:
			System.out.println("default");
		}

		int mouth = 2;
		String res = "";

		switch (mouth) {
		case 1:
			System.out.println(1);
		case 3:
			System.out.println(3);
		case 5:
			System.out.println(5);
		case 7:
			System.out.println(7);
		case 8:
			System.out.println(8);
		case 10:
			System.out.println(10);
		case 12:
			res = "31";
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;

		case 2:
			res = "29";
			break;

		default:
			res = "월이아닙니다.";
		}
		System.out.println(mouth + "월은 " + res + "일 까지입니다.");

		// 난수(랜덤값 : 임의의 추출값
		// java.lang.Math
		// default > java.lang.Math
		// java 페이지 default로 열어놓은 폴더-> (java.lang) >> import java.lang.* 가 생략되어있음.
		// 페이지상단(원칙) import java.lang.Math

		// Math.random()
		// static Random() 객체 생성 없이도 사용 가능
		// static 함수는 자주 사용
		// Returns a double value with a positive sign, greater than or equal to 0.0 and
		// less than 1.0
		// 결과 : 0.0<=random<1.0

		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() * 10 : " + Math.random() * 10);

		// 0~9까지의 정수값만
		System.out.println("(int)Math.random() * 10 : " + (int) (Math.random() * 10));
		// 1~10까지의 정수값만
		System.out.println("(int)Math.random() * 10 : " + ((int) (Math.random() * 10) + 1));

		/*
		 * 우리는 백화점 경품 시스템을 만들려고한다. 경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다. 경품 추천시 1000점이 나오면
		 * 경품으로 TV, NoteBook, 냉장고, 한우 세트, 휴지 
		 * 경품 추천시 900점이 나오면 경품으로 NoteBook, 냉장고, 한우 세트, 휴지 
		 * 경품 추천시 800점이 나오면 경품으로 냉장고, 한우 세트, 휴지 
		 * 경품 추천시 700점이 나오면 경품으로 한우 세트, 휴지 
		 * 경품 추천시 600점이 나오면 경품으로 휴지
		 * 
		 * 그 외 100~500점까지는 칫솔 
		 * 경품 시스템 정수의 범위는 100~1000점까지 한정되어있다.
		 * 
		 * 사용자가 경품 시스템 사용시 램덤하게 100~1000값이 나오게 되어 있습니다.
		 */
		
		int score1 = ((int) (Math.random() * 10) + 1) * 100;
		String result = "경품 :";
		switch (score1) {
		case 1000:
			result += " TV";
		case 900:
			result += " NoteBook";
		case 800:
			result += " 냉장고";
		case 700:
			result += " 한우 세트";
		case 600:
			result += " 휴지";
			break;
		default:
			result += " 칫솔";
		}
		System.out.println("점수 : " + score1);
		System.out.println(result);
	}
}