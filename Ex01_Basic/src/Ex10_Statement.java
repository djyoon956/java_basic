import java.util.Scanner;

// 반복문(while, do-while)

public class Ex10_Statement {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 10) { // 조건 true [ 무한 반복 ]
			System.out.println(i);
			// 반드시 명시적인 증가감
			i--;
		}

		// while (1~100) 까지의 합
		int sum = 0;
		int j = 1;
		while (j <= 100) {
			// System.out.println(j);
			sum += j; // sum = sum + j;
			j++; // 명시적인 증가감
			// sum+=j; //주의합시다 ....^^!

		}
		System.out.println("1~100까지의 합 : " + sum);

		// while 구구단
		int k = 2;
		int p = 1; // local variable
		while (k <= 9) {
			p = 1; // 다시 1 로 할당....
			while (p <= 9) {
				System.out.printf("[%d]*[%d]=[%d]\t", k, p, k * p);
				p++;
				int n = 0;// while 시작 생성 ,,,, while 끝나면 소멸
			}
			System.out.println();
			k++;
		}
		System.out.println("k 값 : " + k);

		// do ~while : 강제적 수행(실행) ... 무조건 한번은 실행 하겠다
		// do{ 실행문 } while(조건)
		//
		// 메뉴 구성
		// 1. 인사업무
		// 2. 급여업무
		// 당신이 원하는 업무 번호를 입력하세요 ? (무조건 한번 ...)
		// 3입력하면 조건에서 true 조건을 만들어서 다시 입력 받도록 강제하는 방법
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("숫자입력해(0~10)");
			inputdata = Integer.parseInt(sc.nextLine());
		} while (inputdata > 10); // 조건 : true do 문을 계속 실행
		// 10보다 큰 값이 오면 true .. do 반복 실행
		// 0~10까지의 값이 입력되면 false while 탈출
		System.out.println("당신이 입력한 값은 :" + inputdata);
	}
}