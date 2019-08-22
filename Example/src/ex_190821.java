import java.util.Scanner;

public class ex_190821 {

	public static void main(String[] args) {
		int UNIT = 10000; // 화폐단위
		int NUM = 0; // 화폐매수
		int SW = 0; // 스위칭 변수 , 화폐의 다음 단위를 위해
		int MONEY = 0; // 입력받는 금액

		Scanner scanner = new Scanner(System.in);
		System.out.printf("금액 입력 (숫자) : ");
		MONEY = Integer.parseInt(scanner.nextLine());

		while (true) {
			NUM = MONEY / UNIT;
			System.out.printf("%d  %d개\n", UNIT, NUM);

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
