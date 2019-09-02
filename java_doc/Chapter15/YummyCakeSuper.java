class Cake2 {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake2 extends Cake2 {
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}

	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}

public class YummyCakeSuper {
	public static void main(String[] args) {
		CheeseCake2 cake = new CheeseCake2();
		cake.yummy();
		cake.tasty();
	}
}
