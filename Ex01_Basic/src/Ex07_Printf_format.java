import java.util.Scanner;

import java.util.regex.Pattern;

public class Ex07_Printf_format {
	public static void main(String[] args) {
		// java :System.out.println();
		// C#: Console.WriteLine();

		System.out.println("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println("D"); // 줄바꿈

		int num = 100;
		System.out.println(num);
		System.out.println("num 값은 :" + num + " 입니다");
		// 형식(format)
		System.out.printf("num 값은 :%d 입니다\n", num);
		// format 형식 문자
		// %d (10진수 형식의 정수) >> d라는 자리에
		// %f (실수)
		// %s (문자열)
		// %c (문자)
		// 특수문자 : \t (Tab) , \n (줄바꿈)
		System.out.printf("num 값은 [%d] 입니다 그리고 [%d] 도 있어요\n", num, 1000);

		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f 변수값은 %f 입니다\n", f); // f 변수값은 3.140000 입니다

		// cmd(console) 창에서 입력한 값 읽어오기
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// import 구문 사용 ..... Scanner 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");

		// String value = sc.nextLine(); //대기 nextLine() 당신이 입력한 값을 문자열로 전달
		// System.out.println("입력값 :" + value);

		// int number = sc.nextInt();//정수값을 읽어서 리턴 하겠습니다
		// System.out.println("정수값 : " + number);

		// sc.nextFloat() 실수값 읽기

		// 권장사항 : nextInt , nextFloat 함수 보다는 nextLine() 을 사용하자
		// Today point
		// [ 문자를 -> 숫자로 ]
		// Integer.parseInt(s) 문자를 정수로
		// Float.parseFloat(s) 문자를 실수로
		// Double.parseDouble(s) 문자를 실수로

		System.out.println("숫자 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("정수값 : " + number);

		// Tip
		// 숫자를 -> 문자를 (가끔)
		String data = String.valueOf(10000);
		System.out.println(data);
	}

}
