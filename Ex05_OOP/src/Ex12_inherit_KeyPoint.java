class Product {
	int price;
	int point;

	Product(int price) {
		this.price = price;
		this.point = (int) (price / 10.0);
	}
}

class Tv11 extends Product {
	String name;

	Tv11() {
		super(500);
		this.name = "Tv";
	}

	@Override
	public String toString() {
		return name;
	}
}

class Audio extends Product {
	String name;

	Audio() {
		super(100);
		this.name = "Audio";
	}

	@Override
	public String toString() {
		return name;
	}
}

class Computer extends Product {
	String name;

	Computer() {
		super(150);
		this.name = "Computer";
	}

	@Override
	public String toString() {
		return name;
	}
}

class Buyer {
	int money;
	int point;

	Buyer(int money) {
		this.money = money;
	}

	// 구매 행위
	// 구매자는 매장에 있는 모든 제품을 구매할 수 있다.
	void BuyTv(Tv11 tv) {
		if (this.money < tv.price) {
			System.out.println("잔액이 부족합니다." + this.money);
			return;
		}

		this.money -= tv.price;
		this.point += tv.point;
		System.out.println("구매한 물건은 : " + tv.toString());
	}

	void BuyComputer(Computer computer) {
		if (this.money < computer.price) {
			System.out.println("잔액이 부족합니다." + this.money);
			return;
		}

		this.money -= computer.price;
		this.point += computer.point;
		System.out.println("구매한 물건은 : " + computer.toString());
	}

	void BuyAudio(Audio audio) {
		if (this.money < audio.price) {
			System.out.println("잔액이 부족합니다." + this.money);
			return;
		}

		this.money -= audio.price;
		this.point += audio.point;
		System.out.println("구매한 물건은 : " + audio.toString());
	}

	void Buy(Product product) {
		if (this.money < product.price) {
			System.out.println("잔액이 부족합니다. : " + this.money);
			return;
		}

		this.money -= product.price;
		this.point += product.point;
		System.out.println("구매한 물건은 : " + product.toString());
	}
}

public class Ex12_inherit_KeyPoint {
	public static void main(String[] args) {
		Buyer buyer = new Buyer(1000);
		buyer.BuyTv(new Tv11());
		buyer.BuyAudio(new Audio());
		buyer.BuyComputer(new Computer());
		buyer.BuyTv(new Tv11());
	}
}
