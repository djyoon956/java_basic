import java.util.Scanner;

public class Ex09_do_while_menu {
	Scanner sc = new Scanner(System.in);

	void inputRecord() {
		System.out.println("성적 데이터 입력 : ");
	}

	void deleteRecord() {
		System.out.println("성적 데이터 삭제 : ");
	}

	void sortRecord() {
		System.out.println("성적 데이터 정렬 : ");
	}

	int displayMenu() {
		System.out.println("***************");
		System.out.println("*****성적 관리*****");
		System.out.println("1. 학생 성적 입력하기");
		System.out.println();
		System.out.println("2. 학생 성적 삭제하기");
		System.out.println();
		System.out.println("3. 학생 성적 이름순 정렬하기");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();

		int menu = 0;
		do {
			try {

				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 4)
					break;
				else
					throw new Exception("메뉴 선택 문제 발생");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("메뉴 1~4까지 선택");
			}
		} while (true);

		return menu;
	}

	public static void main(String[] args) {
		Ex09_do_while_menu ex = new Ex09_do_while_menu();
		while (true) {
			switch (ex.displayMenu()) {
			case 1:
				ex.inputRecord();
				break;
			case 2:
				ex.deleteRecord();
				break;
			case 3:
				ex.sortRecord();
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				// return;
			}
		}
	}
}