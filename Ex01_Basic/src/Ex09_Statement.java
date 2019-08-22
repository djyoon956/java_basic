import java.util.Scanner;

public class Ex09_Statement {
	public static void main(String[] args) {
//		System.out.println("입력");
//		Scanner sc = new Scanner(System.in);
//
//		if (sc.hasNextInt()) { // 의문형 함수 >> true,false
//			System.out.println("정수값");
//		} else {
//			System.out.println("다른값");
		// }
		// sc.hasNextLine() 문자열 데이터 검증

		// 제어문 (*암기*)
		// 조건문 (if 3가지) (switch( ){case..break})

		// 반복문 for (반복 획수 명확), while(true,false), do-while()
		// 분기문 break(블럭 탈출), continue(다음 단계로 진출, 아래 구분 skip)

		int count = 0;
		if (count < 1) {
			System.out.println("True입니다.");
		}

		// java ; : 문장의 끝(해석의 단위)
		if (count < 10)
			System.out.println("{True}");

		char data = 'A';
		switch (data) { // switch(인수,인자) -> 숫자(정수) , char, String 가능
		case 'A':
			System.out.println("문자 비교");
			break; // 탈출의 범위(switch 블럭)

		default:
			System.out.println("else 모든 것");
		}

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);

		// Quiz
		// for문을 사용해서 1~10까지의 홀수의 합을 구해보세요
		// 단, for문 하나만 사용
		int sum2 = 0;
		for (int i = 1; i < 10; i += 2) {
			// System.out.println(i);
			sum2 += i;
		}
		System.out.println("1~10까지의 홀수의 합 : " + sum2);

		// Quiz
		// 1~100까지의 짝수의 합
		// if문 사용
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum3 += i;
		}
		System.out.println("1~10까지의 홀수의 합 : " + sum3);

		// Quiz
		// 입사 시험 (필수)
		// 구구단(이중 for문)
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("[%d] * [%d] = [%d]\t", i, j, i * j);
			}
			System.out.println();
		}

		System.out.println();

		// Point : break 탈출, continue 스킵
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == j) {
					break;
				}
				// System.out.printf("[%d] * [%d] = [%d]\t", i, j, i * j);
				System.out.printf("%s", "*");
			}
			System.out.println();
		}

		System.out.println();

		// Point : break 탈출, continue 스킵
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == j)
					continue;
				System.out.printf("[%d] * [%d] = [%d]\t", i, j, i * j);
				// System.out.printf("%s","*");
			}
			System.out.println();
		}

		for (int i = 100; i >= 0; i--) {
			System.out.println(i);

		}
	}
}
