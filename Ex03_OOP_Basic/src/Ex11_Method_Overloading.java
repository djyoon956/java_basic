/*
객체지향언어
1. 상속(재사용)
2. 캡슐화 (private) -> 함수(read, write) : 간접할당(자원보호) -> 캡슐화된 member field에 대해서 read(get), write(set) 전용 함수 -> setter, getter -> 자동생성이용한다.
3. 다형성 

[다형성 한 부분...]

[Method overloading]
하나의 이름으로 여러가지 기능을 하는 함수
ex) System.out.println()
특징 : overloading은 성능 향상에 도움을 주지 않는다.
		why> 편하게 사용하려고... >> 개발자
		설계도를 생각하면 >> 함수의 활용이 많은 경우 (다양한 parameter을 사용하는 경우)
문법 : 함수으 이름은 같고 parameter의 개수오 ㅏ타입을 달리하는 방법
1, 함수의 이름은 같아야한다.
2. [parameter] 개수 또는 [Type]은 달라야한다.
3. return type은 상관없다.
*/

class Human {
	String name;
	int age;
}

class OverTest {
	void add(Human h) { // 개수는 같지만 parameter type이 틀리다 -> add overloading
						// Human 객체의 주소값
		h.name = "홍길동";
		h.age = 100;
		System.out.println("parameter h 주소값 :"+h);
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
		System.out.println("m 주소값 :"+m);
		ot.add(m);
		System.out.println(m);
	}
}
