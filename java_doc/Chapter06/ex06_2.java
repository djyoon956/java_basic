
public class ex06_2 {
	public static void main(String[] args) {
		System.out.println("***********06-1(1)*********");
		double r = 3.14;
		System.out.printf("������ %.2f�� �ѷ��� %.2f ���̴� %.2f �̴�.\n", r, getRound(r), getArea(r));

		System.out.println("***********06-1(2)*********");
		int number = 0;
		System.out.printf("%d�� �Ҽ����̴� : %s\n", number, isPrimeNumber(number));
		System.out.println("*******1~100�Ҽ��� ���*******");
		for (int i = 1; i < 101; i++) {
			if (isPrimeNumber(i))
				System.out.println(i);
		}
	}

	public static double getRound(double r) {

		return 2 * Math.PI * r;
	}

	public static double getArea(double r) {
		return Math.PI * r * r;
	}

	public static boolean isPrimeNumber(int number) {
		boolean result = true;
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					result = false;
					break;
				}
			}
		} else 
			result = false;

		return result;
	}
}
