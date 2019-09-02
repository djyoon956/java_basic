import java.util.Arrays;
import java.util.Scanner;

class Reservation {

	private Scanner scanner;
	private char[][] seats = null;

	Reservation() {
		scanner = new Scanner(System.in);
		seats = new char[][] { { '□', '□', '□', '□', '□', '□', '□', '□', '□', '□' },
				{ '□', '□', '□', '□', '□', '□', '□', '□', '□', '□' },
				{ '□', '□', '□', '□', '□', '□', '□', '□', '□', '□' } };
	}

	public void start() {
		while (true) {
			switch (showMenu()) {
			case "1":
				search();
				break;
			case "2":
				reservation();
				break;
			case "3":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	private String showMenu() {
		System.out.println("**********************");
		System.out.println("1. 좌석 조회");
		System.out.println("2. 좌석 예약");
		System.out.println("3. 프로그램 종료");
		System.out.println("**********************");

		System.out.print("입력 >> ");
		return scanner.nextLine();
	}

	private void search() {
		System.out.print("\t");
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
		for (int i = 0; i < seats.length; i++) {
			System.out.print(i + "\t");
			for (char value : seats[i])
				System.out.print(value + "\t");

			System.out.println();
		}
	}

	private void reservation() {
		System.out.println("**********************");
		search();
		System.out.println("**********************");

		System.out.print("행을 선택하세요  : ");
		int row = Integer.parseInt(scanner.nextLine());
		char[] target = seats[row];
		System.out.println(Arrays.toString(target));

		System.out.print("열을 선택하세요 : ");
		int column = Integer.parseInt(scanner.nextLine());
		if (target[column] == '■') {
			System.out.println("예약 완료된 좌석입니다.");
		} else {
			target[column] = '■';
			System.out.printf("%d행 %d열 예약 완료!\n", row, column);
		}
	}
}

public class Array_Reservation {
	public static void main(String[] args) {
		Reservation reservation = new Reservation();
		reservation.start();
	}
}
