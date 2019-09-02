/*
추상클래스
미완성 클래스(미완성 설계도)
1. 완성된 코드 + 미완성 코드 
2. 완성(함수 : 실행 블럭이 있는 것) + 미완성(함수 : 실행 블럭이 없는 것)
											ex) public void print();
3. 완성과 미완성의 차이(new를 통해 객체 생성(완성) / new를 통해 객체 생성x(미완성))

정리)
1. 추상(미완성) 클래스는 스스로 객체 생성이 불가능하다. (new 사용 불가)
2. 추상클래스는 결국 완성된 클래스로 만들어서 사용해야한다. -> [상속]을 목적으로한다.
3. 상속 관계에서 미완성된 자원(추상자원) 완성(구현) -> 재정의(override)

why) 추상클래스 >> 설계자가 바라보는 진정한 의미 >> 강제적 구현을 목적으로 한다.
 														>> 재정의를 강제한다.
 														
		정리 : 상속 관계에서 추상메서드 재정의를 강제하기 위해서 사용한다.
*/

abstract class Abclass {
	int pos;

	// 완성된 코드
	void run() {
		pos++;
	}

	// 추상 메서드 (실행 블럭이 없다.)
	abstract void stop();
}

// 추상 클래스는 상속을 통해서만 
class Child extends Abclass {

	@Override
	void stop() {
		this.pos = 0;
		System.out.println("stop : " + pos);
	}
}

public class Ex01_Abstract_Class {
	public static void main(String[] args) {
		// Abclass ab1 = new Abclass(); // Cannot instantiate the type Abclass
		Child child = new Child();
		child.run();
		child.run();
		child.run();
		System.out.println("현재 pos : " + child.pos);
		child.stop();

		// 다형성
		Abclass ab1 = child;
		ab1.stop(); // 부모의 stop() 접근 하지만, 재정의 되어잇다면 자식 stop()으로 접근함.
	}
}
