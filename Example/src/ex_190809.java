import java.util.Random;
import java.util.Scanner;

public class ex_190809 {

	public static void main(String[] args) {
		// ���� 1
		for (int i = 65; i < 91; i++) {
			System.out.println((char) i);
		}

		// ���� 2
		for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}

		// ���� 1
		System.out.println("----------------------------------");
		int sum = 0;
		for (int i = 1; i < 21; i++) {
			if (i % 2 != 0 || i % 3 != 0)
				sum += i;
		}
		System.out.printf("1~20������ �� : %d\n", sum);

		// ���� 2
		System.out.println("----------------------------------");
		System.out.println("�ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ��");
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 6)
					System.out.printf("�ֻ���1 : %d, �ֻ���2 : %d\n", i, j);
			}
		}

		// ���� 3
		System.out.println("----------------------------------");
		System.out.println("���� ���� �� ����");
		System.out.println("(����=> 1, ���� => 2, �� => 3)");
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.print(">> �Է� : ");
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

		System.out.printf("�����  :  %s, ��ǻ�� : %s\n", input == 1 ? "����" : input == 2 ? "����" : "��",
				random == 1 ? "����" : random == 2 ? "����" : "��");
		System.out.println(">> ��� : " + result);
	}
}
