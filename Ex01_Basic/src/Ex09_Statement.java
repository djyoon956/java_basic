import java.util.Scanner;

public class Ex09_Statement {
	public static void main(String[] args) {
//		System.out.println("�Է�");
//		Scanner sc = new Scanner(System.in);
//
//		if (sc.hasNextInt()) { // �ǹ��� �Լ� >> true,false
//			System.out.println("������");
//		} else {
//			System.out.println("�ٸ���");
		// }
		// sc.hasNextLine() ���ڿ� ������ ����

		// ��� (*�ϱ�*)
		// ���ǹ� (if 3����) (switch( ){case..break})

		// �ݺ��� for (�ݺ� ȹ�� ��Ȯ), while(true,false), do-while()
		// �б⹮ break(�� Ż��), continue(���� �ܰ�� ����, �Ʒ� ���� skip)

		int count = 0;
		if (count < 1) {
			System.out.println("True�Դϴ�.");
		}

		// java ; : ������ ��(�ؼ��� ����)
		if (count < 10)
			System.out.println("{True}");

		char data = 'A';
		switch (data) { // switch(�μ�,����) -> ����(����) , char, String ����
		case 'A':
			System.out.println("���� ��");
			break; // Ż���� ����(switch ��)

		default:
			System.out.println("else ��� ��");
		}

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);

		// Quiz
		// for���� ����ؼ� 1~10������ Ȧ���� ���� ���غ�����
		// ��, for�� �ϳ��� ���
		int sum2 = 0;
		for (int i = 1; i < 10; i += 2) {
			// System.out.println(i);
			sum2 += i;
		}
		System.out.println("1~10������ Ȧ���� �� : " + sum2);

		// Quiz
		// 1~100������ ¦���� ��
		// if�� ���
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum3 += i;
		}
		System.out.println("1~10������ Ȧ���� �� : " + sum3);

		// Quiz
		// �Ի� ���� (�ʼ�)
		// ������(���� for��)
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("[%d] * [%d] = [%d]\t", i, j, i * j);
			}
			System.out.println();
		}

		System.out.println();

		// Point : break Ż��, continue ��ŵ
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

		// Point : break Ż��, continue ��ŵ
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
