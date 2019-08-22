// import java.lang.Math;

public class Ex06_Operation {
	public static void main(String[] args) {
		int sum = 0;
		// ���Կ����� (+= , -= , *=, ) ����������
		sum += 1; // sum=sum+1
		sum -= 1; // sum=sum-1;
		System.out.println("sum:" + sum);

		// ������ ��������
		// ���� ... A+, A-, B+, B- (Score)
		// ���� : 94��
		// 95�� �̻� A+
		// �� �ܴ� A-
		// 90�� �̻��̸� A �ε� ... 95 A+, 93 A-
		int score = 55;
		String grade = ""; // ���ڿ� �ʱ�ȭ
		System.out.println("����� ������? :" + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("�׷��Ƿ� ����� ������? :" + grade);

		// sysout+ctrl+space = system.out.println
		// �ڵ� �����ϱ� = ctrl+A ������ > ctrl+shift+f
		int data = 55;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�");
			break;
		case 90:
			System.out.println("90�Դϴ�");
			break;
		case 80:
			System.out.println("80�Դϴ�");
			break;
		default:
			System.out.println("default");

		}

		// break�� ���� ������ �ƴմϴ�. (�ʿ信 ���� ���� �ȴ�.)
		// Case ���� �����ϴ� ���ĺ��� ~ break���� ����Ѵ�.
		data = 80;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�");
		case 90:
			System.out.println("90�Դϴ�");
		case 80:
			System.out.println("80�Դϴ�");
		default:
			System.out.println("default");
		}

		int mouth = 2;
		String res = "";

		switch (mouth) {
		case 1:
			System.out.println(1);
		case 3:
			System.out.println(3);
		case 5:
			System.out.println(5);
		case 7:
			System.out.println(7);
		case 8:
			System.out.println(8);
		case 10:
			System.out.println(10);
		case 12:
			res = "31";
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;

		case 2:
			res = "29";
			break;

		default:
			res = "���̾ƴմϴ�.";
		}
		System.out.println(mouth + "���� " + res + "�� �����Դϴ�.");

		// ����(������ : ������ ���Ⱚ
		// java.lang.Math
		// default > java.lang.Math
		// java ������ default�� ������� ����-> (java.lang) >> import java.lang.* �� �����Ǿ�����.
		// ���������(��Ģ) import java.lang.Math

		// Math.random()
		// static Random() ��ü ���� ���̵� ��� ����
		// static �Լ��� ���� ���
		// Returns a double value with a positive sign, greater than or equal to 0.0 and
		// less than 1.0
		// ��� : 0.0<=random<1.0

		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() * 10 : " + Math.random() * 10);

		// 0~9������ ��������
		System.out.println("(int)Math.random() * 10 : " + (int) (Math.random() * 10));
		// 1~10������ ��������
		System.out.println("(int)Math.random() * 10 : " + ((int) (Math.random() * 10) + 1));

		/*
		 * �츮�� ��ȭ�� ��ǰ �ý����� ��������Ѵ�. ��ǰ �ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�. ��ǰ ��õ�� 1000���� ������
		 * ��ǰ���� TV, NoteBook, �����, �ѿ� ��Ʈ, ���� 
		 * ��ǰ ��õ�� 900���� ������ ��ǰ���� NoteBook, �����, �ѿ� ��Ʈ, ���� 
		 * ��ǰ ��õ�� 800���� ������ ��ǰ���� �����, �ѿ� ��Ʈ, ���� 
		 * ��ǰ ��õ�� 700���� ������ ��ǰ���� �ѿ� ��Ʈ, ���� 
		 * ��ǰ ��õ�� 600���� ������ ��ǰ���� ����
		 * 
		 * �� �� 100~500�������� ĩ�� 
		 * ��ǰ �ý��� ������ ������ 100~1000������ �����Ǿ��ִ�.
		 * 
		 * ����ڰ� ��ǰ �ý��� ���� �����ϰ� 100~1000���� ������ �Ǿ� �ֽ��ϴ�.
		 */
		
		int score1 = ((int) (Math.random() * 10) + 1) * 100;
		String result = "��ǰ :";
		switch (score1) {
		case 1000:
			result += " TV";
		case 900:
			result += " NoteBook";
		case 800:
			result += " �����";
		case 700:
			result += " �ѿ� ��Ʈ";
		case 600:
			result += " ����";
			break;
		default:
			result += " ĩ��";
		}
		System.out.println("���� : " + score1);
		System.out.println(result);
	}
}