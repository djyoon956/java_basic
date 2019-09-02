package java_doc;

import lib.*;

class AppleBox {
	private Apple ap;

	public void set(Apple a) {
		ap = a;
	}

	public Apple getApple() {
		return ap;
	}
}

class OrangeBox {
	private Orange or;

	public void set(Orange o) {
		or = o;
	}

	public Orange getOrange() {
		return or;
	}
}

public class FruitAndBox {
	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();

		aBox.set(new Apple());
		oBox.set(new Orange());

		Apple ap = aBox.getApple();
		Orange or = oBox.getOrange();

		System.out.println(ap);
		System.out.println(or);
	}
}
