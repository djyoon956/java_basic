import java.util.Iterator;

public class Example {
	public static void main(String[] args) {

		// 문제 05-1
		System.out.println("***********05-1*********");
		int num = 120;
		if (num > 0 && num % 2 == 0) {
			System.out.println("양수이면서 짝수");
		}

		// 문제 05-2
		System.out.println("***********05-2*********");
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;

		if (num1 > num2) {
			big = num1;
		} else {
			big = num2;
		}
		System.out.println("큰 수 : " + big);

		if (num1 > num2) {
			diff = num1 - num2;
		} else {
			diff = num2 - num1;
		}
		System.out.println("절댓값 : " + diff);

		// 문제 05-3(1)
		System.out.println("***********05-3(1)*********");
		int n = 3;
		if (n == 1) {
			System.out.println("Simple Java");
		} else if (n == 2) {
			System.out.println("Funny Java");
		} else if (n == 3) {
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming language");
		}
		System.out.println("Do you like Java?");

		// 문제 05-3(2)
		System.out.println("***********05-3(2)*********");
		int n2 = 24;
		String result = "";
		switch (n2) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			result = "0이상 10미만의 수";
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			result = "0이상 10미만의 수";
			break;
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
			result = "0이상 10미만의 수";
			break;
		default:
			result = "음수 혹은 30 이상의 수";
		}
		System.out.println(result);

		// 문제 05-4(1)
		System.out.println("***********05-4(1)*********");
		int number4 = 0;
		int base = 1;
		while (base < 100) {
			number4 += base;
			base++;
		}
		System.out.println("1부터 99까지의 합 : " + number4);

		// 문제 05-4(2)
		System.out.println("***********05-4(2)*********");
		number4 = 1;
		do {
			System.out.println(number4++);
		} while (number4 < 100);
		while (number4 <= 100 && number4 > 0) {
			System.out.println(number4--);
		}

		// 문제 05-4(3)
		System.out.println("***********05-4(3)*********");
		number4 = 1000;
		int res = 0;
		while (number4 > 0) {
			if (number4 % 2 == 0 && number4 % 7 == 0) {
				res += number4;
			}
			number4--;
		}
		System.out.println("1000이하의 자연수 중에서 2의 배수이자, 7의 배수의 합 : " + res);

		// 문제 05-5(1)
		System.out.println("***********05-5(1)*********");
		int number5 = 1;
		for (int i = 1; i < 11; i++) {
			number5 *= i;
		}
		System.out.println("1부터 10까지의 곱 : " + number5);

		// 문제 05-5(2)
		System.out.println("***********05-5(2)*********");
		number5 = 5;
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", number5, i, (number5 * i));
		}

		// 문제 05-6(1)
		int count = 0;
		System.out.println("***********05-6(1)*********");
		for (int i = 1; i < 100; i++) {
			if (!(((i % 5) != 0) || ((i % 7) != 0))) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("count : " + count);

		// 문제 05-6(2)
		System.out.println("***********05-6(2)*********");
		int index6 = 1;
		int result6 = 0;
		while (true) {
			if (index6 % 2 != 0)
				result6 += index6;

			if (result6 > 1000) {
				System.out.println("합 " + result6);
				System.out.println("index : " + index6);
				break;
			}
			index6++;
		}

		// 문제 05-7(1)
		System.out.println("***********05-7(1)*********");
		for (int i = 2; i < 9; i += 2) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
		}

		// 문제 05-7(2)
		System.out.println("***********05-7(2)*********");
		for (int b = 0; b < 10; b++) {
			for (int a = 0; a < 10; a++) {
				if ((a * 10 + b * 10 == 90) && (b + a) == 9 && (a * 10 + b * 10 + b + a == 99)) {
					System.out.printf("A : %d, B : %d\n", a, b);
				}
			}
		}
		
		
	}
}
