import sun.security.util.DerValue;

/*
this : 객체 자신을 가리키는 this (앞으로 생성될 객체의 주소값을 가지는...)
		ex) this.emp, this.age
this : 생성자를 호출하는 this 


상속
부모 :  자식
super(자식 입장에서 보는 [부모의 주소]) : 상속 관계에서 부모 자원 접급

super 
1. 상속관계에서 부모자원 접근
2. 상속관계에서 부모자원의 생성자 명시적으로 호출
*/

class Base {
	String base;

	Base() {
		System.out.println("Base default construtor");
	}

	Base(String base) {
		this.base = base;
		System.out.println("this.base : " + base);
	}

	void baseMethod() {
		System.out.println("baseMethod()");
	}
}

class Derived extends Base {
	String dname;

	Derived() {
		System.out.println("Derived default construtor");
	}

	Derived(String dname) {
		super(dname);
		this.dname = dname;
		System.out.println("this.dname : " + dname);
	}

	void derivedMethod() {
		System.out.println("derivedMethod()");
	}

	// 부모가 가지는 baseMethod 재정의(override)
	@Override
	void baseMethod() {
		System.out.println("부모 함수 재정의");
	}

	void p_method() {
		super.baseMethod();
	}
}

public class Ex06_inherit_super {
	public static void main(String[] args) {
//		Derived d = new Derived();
//		d.baseMethod();
//		d.derivedMethod();

		Derived d2 = new Derived("홍길동");
		// 부모쪽에서도 내가 처리하는 홍길동을 할당하고싶으면?
		d2.baseMethod();
		d2.p_method();
	}
}
