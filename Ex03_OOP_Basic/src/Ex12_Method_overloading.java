class Human2 {
	String name;
	int age;
}

class Test {
	Human2 add(Human2 h) { // �ּҰ��� �޾Ƽ� �ּҰ��� �����Ѵ�.
		h.name = "ȫ�浿";
		h.age = 200;
		return h;
	}

	Human2 add(Human2 h, Human2 h2) {
		h2.age = h.age;
		h2.name = h.name;

		return h2;
	}
}

public class Ex12_Method_overloading {
	public static void main(String[] args) {
		Test t = new Test();
		Human2 man = new Human2();
		Human2 man2 = t.add(man);

		System.out.println("main ���� ���� == man2 ���� ���� : " + man.equals(man2));
		System.out.println(man2.name + "/" + man2.age);

		System.out.println("-------------------------------");
		Human2 m = new Human2();
		m.age = 20;
		m.name = "�ƹ���";
		Human2 m2 = new Human2();
		Human2 m3 = t.add(m, m2);

		System.out.println(m3.name + "/" + m3.age);// => ��) �ƹ���/20

	}
}