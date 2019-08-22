
public class ex06_1 {
	public static void main(String[] args) {
		System.out.println("***********06-1(1)*********");
		add(10, 2);
		sub(10, 2);
		mul(10, 2);
		div(10, 2);

		System.out.println("***********06-1(2)*********");
		getAbsolutevalue(10, 2);
		getAbsolutevalue(-10, -2);
	}

	public static void add(int number1, int number2) {
		System.out.printf("%d+%d = %d\n", number1, number2, number1 + number2);
	}

	public static void sub(int number1, int number2) {
		System.out.printf("%d-%d = %d\n", number1, number2, number1 - number2);
	}

	public static void mul(int number1, int number2) {
		System.out.printf("%d*%d = %d\n", number1, number2, number1 * number2);
	}

	public static void div(int number1, int number2) {
		System.out.printf("%d/%d = %d.%d\n", number1, number2, number1 / number2, number1 % number2);
	}

	public static void getAbsolutevalue(int number1, int number2) {
		System.out.println(Math.abs(number1 - number2));
	}
}
