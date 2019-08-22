/*
��ü������
1. ���(����)
2. ĸ��ȭ (private) -> �Լ�(read, write) : �����Ҵ�(�ڿ���ȣ) -> ĸ��ȭ�� member field�� ���ؼ� read(get), write(set) ���� �Լ� -> setter, getter -> �ڵ������̿��Ѵ�.
3. ������ 

[������ �� �κ�...]

[Method overloading]
�ϳ��� �̸����� �������� ����� �ϴ� �Լ�
ex) System.out.println()
Ư¡ : overloading�� ���� ��� ������ ���� �ʴ´�.
		why> ���ϰ� ����Ϸ���... >> ������
		���赵�� �����ϸ� >> �Լ��� Ȱ���� ���� ��� (�پ��� parameter�� ����ϴ� ���)
���� : �Լ��� �̸��� ���� parameter�� ������ ��Ÿ���� �޸��ϴ� ���
1, �Լ��� �̸��� ���ƾ��Ѵ�.
2. [parameter] ���� �Ǵ� [Type]�� �޶���Ѵ�.
3. return type�� �������.
*/

class Human {
	String name;
	int age;
}

class OverTest {
	void add(Human h) { // ������ ������ parameter type�� Ʋ���� -> add overloading
						// Human ��ü�� �ּҰ�
		h.name = "ȫ�浿";
		h.age = 100;
		System.out.println("parameter h �ּҰ� :"+h);
	}

	int add(int i) {
		return i + 100;
	}

	String add(String s) {
		return "Hello" + s;
	}
}

public class Ex11_Method_Overloading {
	public static void main(String[] args) {
		OverTest ot = new OverTest();
		System.out.println(ot.add(100));
		System.out.println(ot.add("100"));
		Human m=new Human();
		System.out.println("m �ּҰ� :"+m);
		ot.add(m);
		System.out.println(m);
	}
}
