import kr.or.bit.Book;

public class Quiz_Book {
	public static void main(String[] args) {
		Book book1 = new Book("흥부놀부전", 9000);
		System.out.println("book1 책 이름 : " + book1.getName());
		System.out.println("book1 책 가격 : " + book1.getPrice());
		book1.printBookInfo();
		System.out.println("--------------------------");

		Book book2 = new Book("춘향전", 12000);
		System.out.println("book2 책 이름 : " + book2.getName());
		System.out.println("book2 책 가격 : " + book2.getPrice());
		book2.printBookInfo();
		System.out.println("--------------------------");

		Book book3 = new Book("이것이 자바다", 20000);
		System.out.println("book3 책 이름 : " + book3.getName());
		System.out.println("book3 책 가격 : " + book3.getPrice());
		book3.printBookInfo();
		System.out.println("--------------------------");
	}
}
