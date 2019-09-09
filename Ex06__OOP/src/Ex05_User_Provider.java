/*
User 사용자 :  Provider 제공자

class A { }, class B { }
관계 : A는 B를 사용합니다.

1. 상속 : A extends B
2. 포함 : A 클래스 안에서 member filed B (부분과 전체)
			>> class A { B b; }

class B { }
class A {
	int i;
	B b; // 참조 변수
 }

3. 포함 : 함수 내부에서 (method parameter) : 의존관계

class B { }
class A {
	int i;
	
	void print(B b){
	
	}
	
	B print(){
		B b= new B();
		return b;
	}
}

목적 : 의존 관계에서 인터페이스 활용
*/

interface Icall {
	void m();
}

class B implements Icall {

	@Override
	public void m() {
		System.out.println("B Icall Interface m() 구현");
	}
}

class D implements Icall {

	@Override
	public void m() {
		System.out.println("D Icall Interface m() 구현");
	}
}

class F implements Icall {

	@Override
	public void m() {
		System.out.println("F Icall Interface m() 구현");
	}
}

// 현대적인 프로그래밍 기법(Interface)

class C {
	void method(Icall icall) { // 유연하다, 간접적이다.
		icall.m();
	}
}

public class Ex05_User_Provider {
	public static void main(String[] args) {
		C c = new C();
		c.method(new B());
		c.method(new D());
		c.method(new F());
	}
}
