class VendingMachine {
	Drink[] drinks;
	int inputPrice;
	int change;
	boolean button;

	public void startVending() {
		showDrinkPrice();
	}

	public void endVending() {

	}

	private void showDrinkPrice() {

	}

	private void inputPrice() {

	}

	private void choiceDrink() {

	}

	private void activation() {

	}

	private void checkChange() {

	}
}

interface Itest {
	void sale();
}

abstract class Drink implements Itest {
	String name;
	int price;
	int count;

	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
}

class Coke extends Drink {

	public Coke(String name, int price, int count) {
		super(name, price, count);
	}

	@Override
	public void sale() {
		// TODO Auto-generated method stub

	}
}

public class ex_190903 {
	public static void main(String[] args) {
	}
}
