import kr.or.bit.Book;

public class Quiz_Book {
	public static void main(String[] args) {
		Book book1 = new Book("��γ����", 9000);
		System.out.println("book1 å �̸� : " + book1.getName());
		System.out.println("book1 å ���� : " + book1.getPrice());
		book1.printBookInfo();
		System.out.println("--------------------------");

		Book book2 = new Book("������", 12000);
		System.out.println("book2 å �̸� : " + book2.getName());
		System.out.println("book2 å ���� : " + book2.getPrice());
		book2.printBookInfo();
		System.out.println("--------------------------");

		Book book3 = new Book("�̰��� �ڹٴ�", 20000);
		System.out.println("book3 å �̸� : " + book3.getName());
		System.out.println("book3 å ���� : " + book3.getPrice());
		book3.printBookInfo();
		System.out.println("--------------------------");
	}
}
