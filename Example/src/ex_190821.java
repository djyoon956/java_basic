import java.util.Scanner;

public class ex_190821 {

	public static void main(String[] args) {
		int UNIT = 10000; // ȭ�����
		int NUM = 0; // ȭ��ż�
		int SW = 0; // ����Ī ���� , ȭ���� ���� ������ ����
		int MONEY = 0; // �Է¹޴� �ݾ�

		Scanner scanner = new Scanner(System.in);
		System.out.printf("�ݾ� �Է� (����) : ");
		MONEY = Integer.parseInt(scanner.nextLine());

		while (true) {
			NUM = MONEY / UNIT;
			System.out.printf("%d  %d��\n", UNIT, NUM);

			if (UNIT > 1) {
				MONEY = MONEY - (UNIT * NUM);
				if (SW == 0) {
					UNIT = UNIT / 2;
					SW = 1;
				} else {
					UNIT = UNIT / 5;
					SW = 0;
				}
			} else
				System.exit(0);
			;
		}
	}
}
