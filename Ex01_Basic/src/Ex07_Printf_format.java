import java.util.Scanner;

import java.util.regex.Pattern;

public class Ex07_Printf_format {
	public static void main(String[] args) {

		// java : System.out.println();
		// c# : Console.WriteLine();
		// �����ε� : �ϳ��� ����� ���� Ÿ���� �Ű�����(�Ķ����)�� �޴� ����
		System.out.println("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println("D"); // ln-> �ٹٲ�

		int num = 100;
		System.out.println(num);
		System.out.println("num ���� " + num + "�Դϴ�.");

		// format ���� ����
		// %d (10���� ������ ����) >>d��� �ڸ���
		// %f (�Ǽ�)
		// %s (���ڿ�)
		// %c (����)
		// Ư������ : \��, \��
		System.out.printf("num ����[%d]�Դϴ� �׸��� [%d] �� �־��.\n", num, 1000);

		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f ���� ���� [%f]�Դϴ�.\n", f);
		System.out.printf("f ���� ���� [%.2f]�Դϴ�.\n", f);

		// cmd(console)���� �Է��� �� �о����
		// Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է��ϼ���");
//		String value = sc.nextLine(); // ��� ���·� ��ȯ ����� �Է°��� ���ڿ��� ����
//
//		System.out.println("�Է°� : " + value);
//
//		System.out.println("�������� �Է��ϼ���");
//		int number = sc.nextInt(); // ����� �Է°��� ����������
//		System.out.println("������ : " + number);
//		
		// sc.nextFloat(); �Ǽ���

		// ������� : nextInt, nextFloat ���ٴ� nextLine()�� ���

		// Point
		// **[���ڸ� ���ڷ� ����]**
		// Integer.parseInt(value);
		// Float.parseFloat(s)
		// Double.parseDouble(s)
//		System.out.println("���� �Է��ϼ���");
//		int number = Integer.parseInt(sc.nextLine());
//		System.out.println("�Է°�(Int) : " + number);
//
//		// Tip
//		String data = String.valueOf(10000);
//		System.out.println("�Է°�(String) : " + data);

		// Quiz
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print(">�Է°� : ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print(">�Է°�(��ȣ) : ");
		String oper = sc.nextLine();
		System.out.print(">�Է°� : ");
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
			System.err.println("��ȣ ����!");
			return; // ���α׷��� ����
		}

		System.out.println(">������ : " + result);
	}
}
