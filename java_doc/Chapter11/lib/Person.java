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
		System.out.println("�ֹε�� ��ȣ : " + refiNum);

		if (passNum != 0)
			System.out.println("���� ��ȣ : " + passNum);
		else
			System.out.println("������ ������ ���� �ʽ��ϴ�.");
	}
}
