class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	@Override
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}

public class YummyCakeOverriding {
	public static void main(String[] args) {
		Cake c1 = new Cake();
		CheeseCake c2 = new CheeseCake();

		c1.yummy();
		c2.yummy();
	}
}
