/*
생성자 함수(constructor)
1. 함수 (특수한 목적의 함수)
2. 특수한 목적( member field 초기화)

Tip) static  >> static {} ,  일반변수  >>  {}

3. 일반함수와 다른점
3.1  함수의 이름 고정 (class 이름 동일)
3.2  실행시점 때문에 : return Type(x) , void(x) >  default  void  생략 
3.3  실행시점 객체생성시  호출되는 함수 

4. 목적 : 생성된 객체마다 다른 초기값 부여하기 .. ^^
class Car { int door=5;}

5. 생성자 함수는  overloading 이 가능하다 

*****************  개발자의 의도  *****************
*예외적으로  overloading  된 생성자 함수가 하나라도 존재한다면 컴파일러는 자동으로     default 생성자
*함수를 만들지 않는다
*만약   default  생성자 함수를 사용하고 싶다면 강제 구현하세요
*why?  개발자의 강제적 의도가 들어 있는 것  
일반 함수보다 코드량의 감소 ...... 
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

	Car() { // default Constructor
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

	Car2 Test() {
		Car2 temp= new Car2();
		return temp;
	}
	
	void Test1(Car car) {
		car.name="형남";
	}
}

public class Ex13_Constructor_Function {
	public static void main(String[] args) {
//		Car c = new Car(); // Car()�Լ� ȣ��
//		Car2 c2 = new Car2();
//		System.out.println("car2.carname : " + c2.carname);
//		Car2 c22 = new Car2();
//		System.out.println("car22.carname : " + c22.carname);
//
//		Car4 car4 = new Car4(10, 50);
//		Car4 car5 = new Car4(55, 100);
//
//		House h = new House();
//		System.out.println("h.doorcolor : " + h.doorcolor);
//		House h2 = new House("red");
//		System.out.println("h2.doorcolor : " + h2.doorcolor);

		Car4 car4 = new Car4(10, 50);
		Car2 c2 = car4.Test();
	}
}
