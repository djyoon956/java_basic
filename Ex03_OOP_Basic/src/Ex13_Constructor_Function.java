/*
������ �Լ� (Constructor)
1. Ư���� ������ �Լ� 
>> member field �ʱ�ȭ

2. �Ϲ��Լ��� �ٸ���
2.1. class ��� ����
2.2. return type�� ���� 
>> ������� ������
>> ��ü ������ ȣ�� (new Class())

3. ���� : ������ ��ü���� �ٸ� �ʱⰪ �ο��ϱ�

4. ������ �Լ��� overloading ����

****************�������� �ǵ�**************
* ���������� overloading�� ������ �Լ��� �ϳ��� �����Ѵٸ� �����Ϸ��� �ڵ����� default Constructor�� ������ �ʴ´�.
* default Constructor�� ����ؾ��Ѵٸ� ����(����)�����ؾ��Ѵ�.
+) �ʱ���
static >> static { } /�Ϲ� �Լ� >>  {}
*/

class House {
	String doorcolor;

	House() {
		this.doorcolor = "yellow";
	}

	House(String doorcolor) {
		this.doorcolor = doorcolor;
	}
}

class Car {
	String name;

	Car() { // default Constructor�� ������� �ʾƵ� �ڵ����� �����ȴ�.
	}
}

class Car2 {
	String carname;

	Car2() { // default Constructor
		System.out.println("Car2 Constructor.");
		carname = "pony"; // member field�� �ʱ�ȭ
	}
}

class Car3 {
	int number;

	Car3() {
		System.out.println("member filed �ʱ�ȭ");
		// number = 10;
	}
}

class Car4 {
	int door;
	int wheel;

	Car4() { // default Constructor

	}

	// Constructor overloading
	Car4(int door) {
		this.door = door;
		System.out.println("overloading door : " + this.door);
	}

	Car4(int door, int wheel) {
		this.door = door;
		this.wheel = wheel;
		System.out.println("overloading2 door ,wheel : " + this.door + "," + this.wheel);
	}
}

public class Ex13_Constructor_Function {
	public static void main(String[] args) {
		Car c = new Car(); // Car()�Լ� ȣ��
		Car2 c2 = new Car2();
		System.out.println("car2.carname : " + c2.carname);
		Car2 c22 = new Car2();
		System.out.println("car22.carname : " + c22.carname);

		Car4 car4 = new Car4(10, 50);
		Car4 car5 = new Car4(55, 100);

		House h = new House();
		System.out.println("h.doorcolor : " + h.doorcolor);
		House h2 = new House("red");
		System.out.println("h2.doorcolor : " + h2.doorcolor);
	}
}
