import java.util.Scanner;

// �ݺ���(while, do-while)

public class Ex10_Statement {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 10) {
			System.out.println(i);
			// �ݵ�� ������� ������
			i--;
		}

		// 1~100���� ��
		i = 1;
		int sum = 0;
		while (i < 101) {
			// �������� �����Ͽ� �ڵ�
			sum += i++;
		}
		System.out.println("1~100������ �� : " + sum);

		// ������ ���
		i = 2;
		int j = 1;
		while (i < 10) {
			j = 1; // 1�� �� �Ҵ�
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			i++;
		}
		System.out.println("while ���� �� i �� : " + i);

		// do-while : ������ ���� ������ �� �� ����
		// �޴�����
		// 1. �λ����
		// 2.�޿�����
		// ����� ���ϴ� ���� ��ȣ�� �Է��ϼ���.
		i = 1;
		Scanner scanner = new Scanner(System.in);
		int inputData = 0;
		do {
			System.out.println("���� �Է� (0~10)");
//		System.out.println("1. �λ����");	
//		System.out.println("2. �޿�����");	
			inputData = Integer.parseInt(scanner.nextLine());
		} while (inputData > 10); // ������ true�̸� do �� ����
		// 10���� ū ���� ���� true... do �ݺ� ����
		System.out.println("�Է� �� : " + inputData);
	}
}
