import java.util.Scanner;

import java.util.regex.Pattern;

public class Ex07_Printf_format {
	public static void main(String[] args) {

		// java : System.out.println();
		// c# : Console.WriteLine();
		// 오버로딩 : 하나의 기능이 여러 타입의 매개변수(파라미터)를 받는 형태
		System.out.println("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println("D"); // ln-> 줄바꿈

		int num = 100;
		System.out.println(num);
		System.out.println("num 값은 " + num + "입니다.");

		// format 형식 문자
		// %d (10진수 형식의 정수) >>d라는 자리에
		// %f (실수)
		// %s (문자열)
		// %c (문자)
		// 특수문자 : \ㅅ, \ㅜ
		System.out.printf("num 값은[%d]입니다 그리고 [%d] 도 있어요.\n", num, 1000);

		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f 변수 값은 [%f]입니다.\n", f);
		System.out.printf("f 변수 값은 [%.2f]입니다.\n", f);

		// cmd(console)에서 입력한 값 읽어오기
		// Scanner sc = new Scanner(System.in);
//		System.out.println("값을 입력하세요");
//		String value = sc.nextLine(); // 대기 상태로 전환 사용자 입력값을 문자열로 전달
//
//		System.out.println("입력값 : " + value);
//
//		System.out.println("정수값을 입력하세요");
//		int number = sc.nextInt(); // 사용자 입력값을 정수형으로
//		System.out.println("정수값 : " + number);
//		
		// sc.nextFloat(); 실수값

		// 권장사항 : nextInt, nextFloat 보다는 nextLine()을 사용

		// Point
		// **[문자를 숫자로 변경]**
		// Integer.parseInt(value);
		// Float.parseFloat(s)
		// Double.parseDouble(s)
//		System.out.println("숫자 입력하세요");
//		int number = Integer.parseInt(sc.nextLine());
//		System.out.println("입력값(Int) : " + number);
//
//		// Tip
//		String data = String.valueOf(10000);
//		System.out.println("입력값(String) : " + data);

		// Quiz
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print(">입력값 : ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print(">입력값(기호) : ");
		String oper = sc.nextLine();
		System.out.print(">입력값 : ");
		num2 = Integer.parseInt(sc.nextLine());
		sc.close();

		int result = 0;
		if (oper.equals("+")) {
			result = num1 + num2;
		} else if (oper.equals("-")) {
			result = num1 - num2;
		} else if (oper.equals("*")) {
			result = num1 * num2;
		} else if (oper.equals("/")) {
			result = num1 * num2;
		} else {
			System.err.println("기호 오류!");
			return; // 프로그램의 종료
		}

		System.out.println(">연산결과 : " + result);
	}
}
