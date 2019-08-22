
public class ex06_3 {
	public static void main(String[] args) {
		int number = 3;
		System.out.println("***********06-3(1)*********");
		System.out.printf("2의 %d승 : %d\n", number, get2Squared(number));
		
		System.out.println("***********06-3(2)*********");
		number = 10;
		System.out.printf("%d의 이진수 표현법 : \n", number);
		getBinaryNumber(number);
	}

	public static int get2Squared(int number) {
		return number == 0 ? 1 : 2 * get2Squared(number - 1);
	}

	public static void getBinaryNumber(int number) {
		int binary = number % 2;
		int result = number / 2;
		if (result != 0)
			getBinaryNumber(result);
		System.out.print(binary);
	}
}
