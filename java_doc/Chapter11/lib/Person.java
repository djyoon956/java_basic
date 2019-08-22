package lib;

public class Person {
	private int refiNum;
	private int passNum;

	public Person(int rnum, int pnum) {
		refiNum = rnum;
		passNum = pnum;
	}

	public Person(int rnum) {
		refiNum = rnum;
		passNum = 0;
	}

	public void showPersonalInfo() {
		System.out.println("주민등록 번호 : " + refiNum);

		if (passNum != 0)
			System.out.println("여권 번호 : " + passNum);
		else
			System.out.println("여권을 가지고 있지 않습니다.");
	}
}
