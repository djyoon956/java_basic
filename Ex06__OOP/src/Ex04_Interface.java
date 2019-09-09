import java.util.ArrayList;
import java.util.List;

/*
인터페이스
범용적의미
1. 표준, 규칙, 규격, 규약을 만드는 행위

2. 소프트웨어 개발
개발 단계의 최상위 모델 >> 요구사항 >> 설계(고려 인터페이스)
설계표준 -> 사용하는 이행(수행) 강제

Interface
1. 실제 구현부가 없다 > 실행 블럭이 없다 > 이동 약속 > void move(int x, int y); >> 추상메서드
2. 표준화된 설계를 보장(완벽한 강제성)
3. 공통의 설계서

JAVA API (개발자가 필요한 인터페이스를 가지고있다. : 인터페이스 기반으로 클래스 생성)
>> Collection (동적배열) >> Vector, ArrayList, HashSet, HashMap

1. 생성방법
상수(final) : public static final int VERSION=1; >> public static final 생략
				>> int VERSION=1;
함수(method) : public abstract void run(); >> public abstract 생략
					>> void run();
					>> String move(int x, int y);
 interface {
 	int VERSION = 1;
	
	void run();
 	String move(int x, int y);
 }
 
 인터페이스는 객체 생성 불가 (상수 제외한 나머지 자원 : 추상 자원)
 >> 구현을 통해서만 사용 가능
 >> 인터페이스 끼리 다중 상속 가능
 >> 인터페이스도 타입 (다형성 : 부모타입)
*/

interface Ia {
	int AGE = 100;
	String GENDER = "남";

	String print();

	void message(String str);
}

interface Ib {
	int AGE = 10;

	void info();

	String bell(String str);
}

class Test implements Ia, Ib {

	@Override
	public void info() {
		// TODO Auto-generated method stub

	}

	@Override
	public String bell(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub

	}
}

public class Ex04_Interface {
	public static void main(String[] args) {
		Test t = new Test();
		Ia ia = t;
		System.out.println(ia.AGE);
		Ib ib = t;
		System.out.println(ib.AGE);
	}
}
