/*
생성자 함수 (Constructor)
1. 특수한 목적의 함수 
>> member field 초기화

2. 일반함수와 다른점
2.1. class 명과 동일
2.2. return type이 없다 
>> 실행시점 때문에
>> 객체 생성시 호출 (new Class())

3. 목적 : 생성된 객체마다 다른 초기값 부여하기

4. 생성자 함수는 overloading 가능

****************개발자의 의도**************
* 예외적으로 overloading된 생성자 함수가 하나라도 존재한다면 컴파일러는 자동으로 default Constructor을 만들지 않는다.
* default Constructor을 사용해야한다면 강제(직접)구현해야한다.
+) 초기자
static >> static { } /일반 함수 >>  {}
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

	Car() { // default Constructor은 명시하지 않아도 자동으로 생성된다.
	}
}

class Car2 {
	String carname;

	Car2() { // default Constructor
		System.out.println("Car2 Constructor.");
		carname = "pony"; // member field의 초기화
	}
}

class Car3 {
	int number;

	Car3() {
		System.out.println("member filed 초기화");
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
		Car c = new Car(); // Car()함수 호출
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
