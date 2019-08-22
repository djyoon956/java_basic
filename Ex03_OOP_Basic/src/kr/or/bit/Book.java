package kr.or.bit;

/*
 책은 책이름을 가지고 있고 가격을 가지고있다.
 책이 출판되면 반드시 책 이름과 책의 가격을 가지고 있어야한다.
 책의 이름과 가격 정보는 특정 기능을 통해서만 볼 수 있고, 출판된 이후엔 수정 할 수 없다.
 책이름과 가격정보는 각각 확인 할 수 있다.
*/
public class Book {
	// 책은 책이름을 가지고 있고 가격을 가지고있다.
	// 출판된 이후엔 수정 할 수 없다.
	private String name;
	private int price;

	// 책이름과 가격정보는 각각 확인 할 수 있다.
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// 책은 책이름을 가지고 있고 가격을 가지고있다.
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 책의 이름과 가격 정보는 특정 기능을 통해서만 볼 수 있고
	public void printBookInfo() {
		System.out.printf("책 이름 : %s, 책 가격 : %d\n", name, price);
	}
}
