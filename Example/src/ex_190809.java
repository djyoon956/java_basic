import java.util.Random;
import java.util.Scanner;

public class ex_190809 {

	public static void main(String[] args) {
		// 개인 1
		for (int i = 65; i < 91; i++) {
			System.out.println((char) i);
		}

		// 개인 2
		for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}

		// 조별 1
		System.out.println("----------------------------------");
		int sum = 0;
		for (int i = 1; i < 21; i++) {
			if (i % 2 != 0 || i % 3 != 0)
				sum += i;
		}
		System.out.printf("1~20까지의 합 : %d\n", sum);

		// 조별 2
		System.out.println("----------------------------------");
		System.out.println("두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수");
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 6)
					System.out.printf("주사위1 : %d, 주사위2 : %d\n", i, j);
			}
		}

		// 조별 3
		System.out.println("----------------------------------");
		System.out.println("가위 바위 보 게임");
		System.out.println("(가위=> 1, 바위 => 2, 보 => 3)");
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.print(">> 입력 : ");
			input = Integer.parseInt(scanner.nextLine());
		} while (!(input > 0 && input < 4));
		scanner.close();

		int random = new Random().nextInt(3) + 1;
		String result;
		if (input == 1) {
			result = random == 3 ? "WIN" : random == 1 ? "SAME" : "LOSE";
		} else if (input == 2) {
			result = random == 1 ? "WIN" : random == 2 ? "SAME" : "LOSE";
		} else {
			result = random == 2 ? "WIN" : random == 3 ? "SAME" : "LOSE";
		}

		System.out.printf("사용자  :  %s, 컴퓨터 : %s\n", input == 1 ? "가위" : input == 2 ? "바위" : "보",
				random == 1 ? "가위" : random == 2 ? "바위" : "보");
		System.out.println(">> 결과 : " + result);
	}
}
