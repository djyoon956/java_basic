
//2. this (생성자 호출하는 this)
//원칙 :  생성자는 객체 생성시 한개만 호출 가능
//this 여러개의 생성자 함수를 호출....

class Zcar {
	String color;
	String gearType;
	int door;

	Zcar() {
		// this.color = "red";
		// this.gearType = "auto";
		// this.door = 4;

		// this==객체자신을 가르키기 때문에 다른 생성자를 호출 할 수 있다.
		// 다시 class Zcar 진입한다고 생각
		this("red", "auto", 4);
		System.out.println("default Constructor!");
	}

	Zcar(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading Constructor!");
	}

	void print() {
		System.out.println(this.color + "/" + this.gearType + "/" + this.door);
	}
}

class Zcar3 {
	String color;
	String gearType;
	int door;

	Zcar3() {
		this("red", 1);
		System.out.println("default Constructor");
	}

	Zcar3(String color, int door) {
		this(color, "auto", door);
		System.out.println("overloading Constructor param 2개");
	}

	Zcar3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading Constructor param 3개");
	}

	void print() {
		System.out.println(this.color + "/" + this.gearType + "/" + this.door);
	}
}

public class Ex16_this_Constructor {
	public static void main(String[] args) {
		Zcar z = new Zcar();
		z.print();

		System.out.println("----------------------------------");
		Zcar z2 = new Zcar("blue", "auto", 10);
		z2.print();

		System.out.println("----------------------------------");
		Zcar3 z3 = new Zcar3();
		z3.print();

		System.out.println("----------------------------------");
		Zcar3 z33 = new Zcar3("gold", 2);
		z33.print();
	}
}
