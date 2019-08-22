package kr.or.bit;

/*
 å�� å�̸��� ������ �ְ� ������ �������ִ�.
 å�� ���ǵǸ� �ݵ�� å �̸��� å�� ������ ������ �־���Ѵ�.
 å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� �� �� �ְ�, ���ǵ� ���Ŀ� ���� �� �� ����.
 å�̸��� ���������� ���� Ȯ�� �� �� �ִ�.
*/
public class Book {
	// å�� å�̸��� ������ �ְ� ������ �������ִ�.
	// ���ǵ� ���Ŀ� ���� �� �� ����.
	private String name;
	private int price;

	// å�̸��� ���������� ���� Ȯ�� �� �� �ִ�.
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// å�� å�̸��� ������ �ְ� ������ �������ִ�.
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� �� �� �ְ�
	public void printBookInfo() {
		System.out.printf("å �̸� : %s, å ���� : %d\n", name, price);
	}
}
