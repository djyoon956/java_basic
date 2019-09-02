class Cake3 {
	int size;

	Cake3(int sz) {
		size = sz;
	}

	public void showCakeSize() {
		System.out.println("Bread Ounces : " + size);
	}
}

class CheeseCake3 extends Cake3 {
	int size;

	CheeseCake3(int sz1, int sz2) {
		super(sz1);
		size = sz2;
	}

	public void showCakeSize() {
		System.out.println("Bread Ounces : " + super.size);
		System.out.println("Cheese Ounces : " + size);
	}

}

public class YummyCakeSize {
	public static void main(String[] args) {
		CheeseCake3 ca1 = new CheeseCake3(5, 7);
		Cake3 ca2 = ca1;

		System.out.println("Bread Ounce : " + ca2.size);

		System.out.println("Cheese Ounce : " + ca1.size);
		System.out.println();

		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();

	}
}
