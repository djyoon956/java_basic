//������
public class Ex05_Operation {

	public static void main(String[] args) {
		int result = 100 / 100;
		System.out.println(result);

		result = 13 / 2; // ��
		System.out.println(result);

		result = 13 % 2; // ������ ���ϴ� ������ %
		System.out.println(result);

		// ����, ����(������ ������ : ++, --) 1�� ����, 1�� ����
		int i = 10;
		++i;// ��ġ���� i=i+1;
		System.out.println(i);
		i++;// ��ġ����
		System.out.println(i);
		// ������ ȥ�� : ��ġ�� ��ġ�� ����

		// POINT : ��ġ ��ġ�� �ٸ� �����ڿ� ���յ��� ��� ������ ����
		int i2 = 5;
		int j2 = 4;

		int result2 = i2 + ++j2;
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		result2 = i2 + j2++;
		System.out.println("result2 : " + result2 + " j2 : " + j2);

		// POINT
		// �ڹ��� ���� ��Ģ
		// ������ ��� ������ int�� ��ȯ �Ŀ� ó���Ѵ�
		// byte + byte => �����Ϸ��� int + int
		byte b = 100; // -128 ~ 127
		byte c = 28;
		byte d = (byte) (b + c);
		System.out.println(d);
		// 1. int d = b + c;
		// 2. byte d = (b + c); ������ �ս��� �� ���� �ִ�.

		// byte + short => int + int
		// char + char => int + int
		// ����ó����
		// POINT : ���꿡�� int���� ���� Ÿ���� int�� ��ȯ�Ѵ�. (long ����)
		// ����(byte, char, short -> int) �ٲپ ó��

		// ��Ģ �ǿ����� �� ǥ�� ������ ū Ÿ������ �� ��ȯ�ȴ�.
		// byte + short => int + int
		// char + int => int + int
		// int + long -> long + long

		// ���� + �Ǽ�
		long ll = 10000000000L;
		float ff = 1.2F;
		float fresult = ll + ff; // �Ǽ��� �̱��
		System.out.println(fresult);

		float num2 = 10.45F;
		int num3 = 20;
		float result5 = num2 + num3; // �޴� ���� ū Ÿ������ �ϸ� ��� ���� float+int >> float + float
		System.out.println(result5);
		// int result5=(int)(num2+num3);
		// System.out.println(result5); //���� 30.45�ε� 30�� ��µǴ� 0.45��ŭ ������ �ս��� �Ͼ��.

		char c2 = '!'; // char�� ����Ÿ�� (���������� ����)
		char c3 = '!';

		// c2+c3 �����?
		// char result6=c2+c3; int + int�� �Ǿ������ ������ �ȵ�
		int result6 = c2 + c3;
		System.out.println("result6 : " + result6);
		// ���� ���� ���ڷ� ��� : 10���� 66�� �ƽ�Ű�ڵ�ǥ ���ڷ� ���
		System.out.println((char) result6);

		// ���
		// �߼ұ�� ���蹮��(������ ���) >> (�� ���)
		// main �Լ��ȿ� �ִ� local variable
		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			// System.out.println("j : "+j);
			if (j % 2 == 0) { // ==�� true, false�� ��Ÿ����.
				// System.out.println("j : " + j);
				sum += j;// sum = sum + j;
			} // j�� for���ȿ��� ����ǰ� ������� ������ ��� ����!!!!!
		}
		System.out.println(sum);

		// ==������(���� ���ϴ� ������)
		if (10 == 10.0F) { // ���� ���ϱ⶧���� Ÿ���� �޶� True�� ���´�.
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// ! ����������
		if ('A' != 65) { // ���� �ʴ�?
			System.out.println("���� �ʾ�");
		} else {
			System.out.println("����");
		}
		// �ϱ�����(POINT)
		// ���׿�����
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		System.out.println("result8 : " + result8);
		// ���׿����ڴ� if���� ȣȯ ����

		if (p == k) {
			result8 = p;
		} else {
			result8 = k;
		}

		// ����ǥ
		/*
		 * (������) 0 : false 1 : true OR AND 0 0 0 0 0 1 1 0 1 0 1 0 1 1 1 1
		 * 
		 * sql�� (oracle) select * from emp where empno=1000 and sal > 2000 //�׸���
		 * 
		 * select * from emp where empno=1000 or sal > 2000 //�Ǵ�
		 * 
		 * ������ | or ������ & and ������ 0�� 1�� ��ȯ�ؼ� bit������ �ض�
		 * 
		 * || ������ && ������
		 */

		int x = 3;
		int y = 5;
		System.out.println("x|y : " + (x | y));
		System.out.println("x&y : " + (x & y));
		// ������ 3�� -> 2����(0�� 1�θ� �̷���� ������ �ٲپ)
		// 2 0��, 2 1��
		// 8 4 2 1
		// 0 0 1 1 >> 3�� 2���� ��
		// 0 1 0 1 >> 5�� 2���� ��
		// 0 1 1 1 >> OR���� -> 7
		// 0 0 0 1 >> AND���� -> 1

		// POINT ������(&&(and), ||(or))
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 &&....){���๮} //True, False�� �����Ǵ¼���
		// ������.
		// if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1 ||....){���๮}
	}

}