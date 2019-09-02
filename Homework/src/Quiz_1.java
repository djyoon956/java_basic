import java.nio.channels.Pipe;

import javax.print.attribute.standard.Sides;

/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
*/

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}

}

class Tv extends Product {
	String name;

	public Tv(String name, int price) {
		super(price);
		this.name = name;
	}
}

class Computer extends Product {
	String name;

	public Computer(String name, int price) {
		super(price);
		this.name = name;
	}
}

class Audio extends Product {
	String name;

	public Audio(String name, int price) {
		super(price);
		this.name = name;
	}
}

class Buyer {
	int money;
	int point;

	public Buyer(int money) {
		this.money = money;
	}

	public void buy(Product product) {
		if (money < product.price) {
			System.out.println("금액이 부족합니다!");
			System.out.println(">> 현재 잔액 : " + money);
			return;
		}
		money -= product.price;
		point += product.price / 10;
	}

	@Override
	public String toString() {
		return "Buyer [money=" + money + ", point=" + point + "]";
	}
}

public class Quiz_1 {
	public static void main(String[] args) {
		Buyer buyer = new Buyer(10000);
		System.out.println(buyer.toString());
		buyer.buy(new Tv("tv", 1000));
		System.out.println(buyer.toString());
		buyer.buy(new Computer("computer", 1000));
		System.out.println(buyer.toString());
		buyer.buy(new Audio("audio", 10000));
	}
}
