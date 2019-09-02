package java_doc;

import lib.*;

class Box {
	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}
}

public class FruitAndBox2 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		aBox.set(new Apple());
		oBox.set(new Orange());

		Apple ap = (Apple) aBox.get();
		Orange or = (Orange) oBox.get();

		System.out.println(ap);
		System.out.println(or);
	}
}
