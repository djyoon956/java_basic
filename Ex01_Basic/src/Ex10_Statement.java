import java.util.Scanner;

// 반복문(while, do-while)

public class Ex10_Statement {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 10) {
			System.out.println(i);
			// 반드시 명시적인 증가감
			i--;
		}

		// 1~100까지 합
		i = 1;
		int sum = 0;
		while (i < 101) {
			// 증가감에 주의하여 코딩
			sum += i++;
		}
		System.out.println("1~100까지의 합 : " + sum);

		// 구구단 출력
		i = 2;
		int j = 1;
		while (i < 10) {
			j = 1; // 1로 재 할당
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			i++;
		}
		System.out.println("while 종료 후 i 값 : " + i);

		// do-while : 강제적 실행 무조건 한 번 실행
		// 메뉴구성
		// 1. 인사업무
		// 2.급여업무
		// 당신이 원하는 업무 번호를 입력하세요.
		i = 1;
		Scanner scanner = new Scanner(System.in);
		int inputData = 0;
		do {
			System.out.println("숫자 입력 (0~10)");
//		System.out.println("1. 인사업무");	
//		System.out.println("2. 급여업무");	
			inputData = Integer.parseInt(scanner.nextLine());
		} while (inputData > 10); // 조건이 true이면 do 블럭 실행
		// 10보다 큰 값이 오면 true... do 반복 실행
		System.out.println("입력 값 : " + inputData);
	}
}
